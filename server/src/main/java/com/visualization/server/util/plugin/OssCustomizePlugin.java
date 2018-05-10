package com.visualization.server.util.plugin;

import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.XmlConstants;
import org.mybatis.generator.exception.ShellException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

/**
 * Oss自定义plugin
 * 
 * 自定义功能：
 * 1. 生成新Dao类并继承统一基类，Dao类名规则可自定义。
 * 2. 生成扩展MapperXml文件，Xml文件名规则可自定义。
 * 
 * @author wj-xia
 *
 */
public class OssCustomizePlugin extends PluginAdapter {

	public static final String PK_TYPE = "java.lang.Integer";

	private ShellCallback shellCallback = null;

	private String daoTargetDir;

	private String daoTargetPackage;

	private String daoSuperClass;
	
	private String javaMapperFileName;

	public OssCustomizePlugin() {
        System.out.println("OssCustomizePlugin() start ");
		shellCallback = new DefaultShellCallback(false);		
	}

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
		String tableName = introspectedTable.getFullyQualifiedTableNameAtRuntime();
        System.out.println("initialized start. Tartget: " + tableName);
        
        //printIntrospectedTableInfo(introspectedTable);
        
        String baseRecordType = introspectedTable.getBaseRecordType();
        
        // 自定义JavaMapper文件名
        String shortName = baseRecordType.substring(baseRecordType.lastIndexOf(".") + 1);
        javaMapperFileName = daoTargetPackage + "." + shortName + "Mapper";
        System.out.println("Java Mapper FileName = " + javaMapperFileName);

        // 设置SqlMapper的namespace
        introspectedTable.setMyBatis3JavaMapperType(javaMapperFileName);

    	// 自定义Example文件名
    	String exampleType = introspectedTable.getExampleType();
    	exampleType = exampleType.replace("Example", "EntityExample");
    	introspectedTable.setExampleType(exampleType);
        System.out.println("Java Example FileName= " + exampleType);

    	// 自定义Entity文件名
        introspectedTable.setBaseRecordType(baseRecordType + "Entity");
        System.out.println("Java Entity FileName = " + introspectedTable.getBaseRecordType());
    }

	@Override
	public boolean validate(List<String> warnings) {
        System.out.println("validate start ");
        
		daoTargetDir = properties.getProperty("daoTargetDir");
		boolean valid = stringHasValue(daoTargetDir);

		daoTargetPackage = properties.getProperty("daoTargetPackage");
		boolean valid2 = stringHasValue(daoTargetPackage);

		daoSuperClass = properties.getProperty("daoSuperClass");
		boolean valid3 = stringHasValue(daoSuperClass);

		boolean check = valid && valid2 && valid3;
		if (!check) {
			System.out.println("Required parameter missing.");
		}
		return check;
	}

	/**
	 * 生成扩展Mapper文件
	 */
	@Override
	public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
		System.out.println("------ 开始: 生成Dao类文件 ------");

		List<GeneratedJavaFile> mapperJavaFiles = new ArrayList<GeneratedJavaFile>();

		Interface mapperInterface = new Interface(javaMapperFileName);
		// 添加生成类注解内容
		mapperInterface.setVisibility(JavaVisibility.PUBLIC);
		mapperInterface.addJavaDocLine(" /**");
		mapperInterface.addJavaDocLine(" * 可手动添加与扩展XML文件中对应的同名方法");
		mapperInterface.addJavaDocLine(" */");

		// 添加import包名
		FullyQualifiedJavaType subModelJavaType = new FullyQualifiedJavaType(introspectedTable.getBaseRecordType());
		FullyQualifiedJavaType subModelExampleJavaType = new FullyQualifiedJavaType(introspectedTable.getExampleType());
		FullyQualifiedJavaType daoSuperType = new FullyQualifiedJavaType(daoSuperClass);
		mapperInterface.addImportedType(daoSuperType);
		mapperInterface.addImportedType(subModelJavaType);
		mapperInterface.addImportedType(subModelExampleJavaType);

		// 添加泛型支持
		FullyQualifiedJavaType daoExtendsType = new FullyQualifiedJavaType(daoSuperType.getShortName());
		daoExtendsType.addTypeArgument(subModelJavaType);
		daoExtendsType.addTypeArgument(subModelExampleJavaType);
		daoExtendsType.addTypeArgument(new FullyQualifiedJavaType(PK_TYPE)); // 主键类型
		mapperInterface.addSuperInterface(daoExtendsType);

		try {
			GeneratedJavaFile mapperJavafile = new GeneratedJavaFile(mapperInterface, daoTargetDir, context.getJavaFormatter());
			File mapperDir = shellCallback.getDirectory(daoTargetDir, daoTargetPackage);
			File mapperFile = new File(mapperDir, mapperJavafile.getFileName());
			// 文件不存在
			if (!mapperFile.exists()) {
				mapperJavaFiles.add(mapperJavafile);
			}
		} catch (ShellException e) {
			e.printStackTrace();
		}

		System.out.println("------ 结束: 生成Dao类文件 ------");
		return mapperJavaFiles;
	}

    /* 
     * 生成扩展Mapper Xml文件
     */
    @Override
    public List<GeneratedXmlFile> contextGenerateAdditionalXmlFiles(IntrospectedTable introspectedTable) {
		System.out.println("------ 开始：生成扩展xml文件 ------");

		List<GeneratedXmlFile> answer = new ArrayList<GeneratedXmlFile>(1);

		try {
			// 生成新的空的xml
			Document document = new Document(XmlConstants.MYBATIS3_MAPPER_PUBLIC_ID, XmlConstants.MYBATIS3_MAPPER_SYSTEM_ID);
			XmlElement root = new XmlElement("mapper");
			root.addAttribute(new Attribute("namespace", introspectedTable.getMyBatis3SqlMapNamespace()));
			document.setRootElement(root);

			String fileName = introspectedTable.getMyBatis3XmlMapperFileName();
			String targetPackage = introspectedTable.getMyBatis3XmlMapperPackage() + ".ext";
			String targetProject = context.getSqlMapGeneratorConfiguration().getTargetProject();

			GeneratedXmlFile gxf = new GeneratedXmlFile(document, fileName, targetPackage, targetProject, true, context.getXmlFormatter());

			File mapperXmlDir = shellCallback.getDirectory(targetProject, introspectedTable.getMyBatis3XmlMapperPackage());
			File mapperXmlFile = new File(mapperXmlDir, fileName);
			// 删除原生Mapper Xml文件，否则会被merge。
			if (mapperXmlFile.exists()) {
				mapperXmlFile.delete();
			}

			answer.add(gxf);

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (ShellException e) {
			e.printStackTrace();
		}

		System.out.println("------ 结束：生成扩展xml文件 ------");
    	
    	return answer;
    }

	/**
	 * 打印表生成对象基本信息
	 * 
	 * @param introspectedTable
	 */
//	private void printIntrospectedTableInfo(IntrospectedTable introspectedTable) {
//    	System.out.println("introspectedTable.getTableType() = " + introspectedTable.getTableType());
//    	System.out.println("introspectedTable.getBaseRecordType() = " + introspectedTable.getBaseRecordType());
//    	System.out.println("introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime() = " + introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime());
//    	System.out.println("introspectedTable.getExampleType() = " + introspectedTable.getExampleType());
//    	System.out.println("introspectedTable.getMyBatis3FallbackSqlMapNamespace() = " + introspectedTable.getMyBatis3FallbackSqlMapNamespace());
//    	System.out.println("introspectedTable.getMyBatis3JavaMapperType() = " + introspectedTable.getMyBatis3JavaMapperType());
//    	System.out.println("introspectedTable.getMyBatis3SqlMapNamespace() = " + introspectedTable.getMyBatis3SqlMapNamespace());
//    	System.out.println("introspectedTable.getMyBatis3XmlMapperFileName() = " + introspectedTable.getMyBatis3XmlMapperFileName());
//    	System.out.println("introspectedTable.getMyBatis3XmlMapperPackage() = " + introspectedTable.getMyBatis3XmlMapperPackage());
//	}
	
}
