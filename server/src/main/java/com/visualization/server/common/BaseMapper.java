package com.visualization.server.common;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Mapper泛型类
 * 
 * @param <T>
 * @param <TE>
 * @param <PK>
 * 
 * @author wj-xia
 * 
 */
public interface BaseMapper<T, TE, PK> {
	long countByExample(TE example);

    int deleteByExample(TE example);

    int deleteByPrimaryKey(PK id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(TE example);

    T selectByPrimaryKey(PK id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") TE example);

    int updateByExample(@Param("record") T record, @Param("example") TE example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> selectByExampleWithRowbounds(TE example, RowBounds rowBounds);

}
