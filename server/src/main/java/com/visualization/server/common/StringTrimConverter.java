package com.visualization.server.common;

import org.springframework.core.convert.converter.Converter;
/**
 * @DESC : 自定义去除字符串两边空格转换器
 * @Author:Wj-X
 * @Date : 2018-05-08 14:19
 */
public class StringTrimConverter implements Converter<String, String> {

	@Override
	public String convert(String source) {
		try {
			//去掉字符串两边空格，如果去除后为空设置为null
			if(source!=null){
				source = source.trim();
				if(source.equals("")){
					return null;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return source;
	}

}
