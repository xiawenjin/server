package com.visualization.server.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @DESC :
 * @Author:Wj-X
 * @Date : 2018-05-07 10:56
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value="/test",method = {RequestMethod.GET})
    public String test(){

        return "test";
    }

}
