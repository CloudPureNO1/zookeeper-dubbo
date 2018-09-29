package com.zookeeper.dubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zookeeper.dubbo.api.UserServiceApi;
import com.zookeeper.dubbo.bea.UserBean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/user")
public class UserContrller {

     @Reference(version = "${demo.service.version}")
    private UserServiceApi userServiceApi;

    @GetMapping(value="/getUser/{id}")
    @ResponseBody
    public UserBean getUser(@PathVariable("id") Long id){
        return userServiceApi.getUser(id);
    }

    @GetMapping(value="/getAll")
    @ResponseBody
    public List<UserBean> getAllUser(){
        return userServiceApi.getAllUser();
    }
}
