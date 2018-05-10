package com.visualization.server.service.impl;

import com.visualization.server.mapper.RelationMapper;
import com.visualization.server.pojo.RelationEntity;
import com.visualization.server.pojo.RelationEntityExample;
import com.visualization.server.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @DESC :
 * @Author:Wj-X
 * @Date : 2018-05-07 11:09
 */
@Service
public class RelationServiceImpl implements RelationService{

    @Autowired
    private RelationMapper relationMapper;

    @Override
    public List<RelationEntity> findAll(RelationEntityExample tr) {
        return relationMapper.selectByExample(tr);
    }

    @Override
    public RelationEntity getRelation(Integer id) {
        return relationMapper.selectByPrimaryKey(id);
    }
}
