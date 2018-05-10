package com.test;

import com.visualization.server.mapper.RelationMapper;
import com.visualization.server.pojo.RelationEntity;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @DESC :
 * @Author:Wj-X
 * @Date : 2018-05-08 11:19
 */
public class TestMapper {

    private ApplicationContext applicationContext;
    private RelationMapper relationMapper;

    @Before
    public void setUp() throws Exception {
        // 创建spring容器

        applicationContext = new ClassPathXmlApplicationContext(
                "spring/applicationContext-*.xml");
        //获取代理对象
        relationMapper = (RelationMapper) applicationContext.getBean("relationMapper");

    }
    @Test
    public void test(){
        RelationEntity relationEntity = relationMapper.selectByPrimaryKey(10);
        System.out.println(relationEntity);

    }
}
