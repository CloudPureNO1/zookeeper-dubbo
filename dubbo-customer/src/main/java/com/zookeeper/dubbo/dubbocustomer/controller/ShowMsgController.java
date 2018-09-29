package com.zookeeper.dubbo.dubbocustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zookeeper.dubbo.api.MsgServiceApi;

import com.zookeeper.dubbo.api.UserServiceApi;
import com.zookeeper.dubbo.bea.UserBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/msg")
public class ShowMsgController {

    /**
     * @Reference  com.alibaba.dubbo.config.annotation.Reference 时duboo 的@Reference注解
     * 版本是与服务端对应的版本，都是在配置文件中mydubbo.demo.service.version
     */
    @Reference(version = "${mydubbo.demo.service.version}")
    private MsgServiceApi msgServiceApi;

    /**
     * @Reference  com.alibaba.dubbo.config.annotation.Reference 时duboo 的@Reference注解
     * 版本是与服务端对应的版本，都是在配置文件中mydubbo.demo.service.version
     */
    @Reference(version = "${mydubbo.demo.service.version}")
    private UserServiceApi userServiceApi;

    @GetMapping(value="/showMsg/{id}")
    public String showMsg(@PathVariable("id")Long id,@RequestParam("name")String name){
        return msgServiceApi.getMsg(name)+">>>>>>>>>>>>>>>>>这是你需要的信息："+userServiceApi.getUser(id);
    }


    @GetMapping(value="/getAll")
    public List<UserBean> getAllUser(){
        return userServiceApi.getAllUser();
    }
}
