package com.zookeeper.dubbo.dubboprovider.spi;

import com.alibaba.dubbo.config.annotation.Service;
import com.zookeeper.dubbo.api.MsgServiceApi;

/**
 * @Service  com.alibaba.dubbo.config.annotation.Service 一定要是dubbo的Service注解
 * 版本取配置文件中的mydubbo.demo.service.version=1.0.0，调用时根据版本号关联
 */
@Service(version = "${mydubbo.demo.service.version}")
public class MsgServiceImpSpi implements MsgServiceApi {
    @Override
    public String getMsg(String name) {
        return name+"，你好，这是来自服务端dubbo-provider的业务信息！";
    }
}
