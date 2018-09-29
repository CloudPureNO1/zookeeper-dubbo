package com.zookeeper.dubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.zookeeper.dubbo.api.MsgServiceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {


    @Reference(version = "${demo.service.version}")
    private MsgServiceApi msgService;



    @GetMapping(value="/getMsg/{name}")
    public String getMsg(@PathVariable("name")String name){
        return msgService.getMsg(name);
    }
}
