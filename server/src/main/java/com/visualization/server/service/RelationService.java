package com.visualization.server.service;

import com.visualization.server.pojo.RelationEntity;
import com.visualization.server.pojo.RelationEntityExample;

import java.util.List;

/**
 * @DESC :
 * @Author:Wj-X
 * @Date : 2018-05-07 11:07
 */

public interface RelationService {
    List<RelationEntity> findAll(RelationEntityExample tr);
    RelationEntity getRelation(Integer id);

}
