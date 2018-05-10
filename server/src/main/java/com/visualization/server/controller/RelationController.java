package com.visualization.server.controller;

import com.visualization.server.pojo.RelationEntity;
import com.visualization.server.service.RelationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @DESC :
 * @Author:Wj-X
 * @Date : 2018-05-07 11:11
 */
@Controller
@RequestMapping("relation")
public class RelationController {

    private static Logger logger= LoggerFactory.getLogger(RelationController.class);
    @Autowired
    private RelationService relationService;

    @RequestMapping(value = "/findAllRelation",method = {RequestMethod.GET})
    public String findAllRelation(HttpServletRequest request){
      List<RelationEntity> list=relationService.findAll(null);
      request.setAttribute("list",list);
      return "rela/relation";
    }


    @RequestMapping("/getRelation/{id}")
    public String getRelation(HttpServletRequest request,@PathVariable("id") Integer id){
        RelationEntity relation = relationService.getRelation(id);
        request.setAttribute("relation",relation);
        return "rela/page";
    }

    @RequestMapping("/getIp")
    public String getIp(){
        return "rela/getip";
    }


    @ResponseBody
    @RequestMapping(value = "/getRe")
    public RelationEntity getRe(@RequestParam("id") Integer id){
        RelationEntity relation = relationService.getRelation(id);
        return relation;
    }
}
