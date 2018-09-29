package com.zookeeper.dubboserver.spi;

import com.alibaba.dubbo.config.annotation.Service;
import com.zookeeper.dubbo.api.MsgServiceApi;

@Service(version = "${demo.service.version}")
public class MsgServiceImp implements MsgServiceApi {
    @Override
    public String getMsg(String name) {
        return ">>>>>>>>>>>>>>>>>>Hello,"+name+"! This is a greeting from Spring Boot!";
    }


}
