package com.zookeeper.dubbo.dubboprovider.spi;

import com.alibaba.dubbo.config.annotation.Service;
import com.zookeeper.dubbo.api.UserServiceApi;
import com.zookeeper.dubbo.bea.UserBean;
import com.zookeeper.dubbo.dubboprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * @Service com.alibaba.dubbo.config.annotation.Service 是dubbo的@Service注解，而不是spring的业务@Service 注解
 * mydubbo.demo.service.version 版本号，在配置文件中配置，在客服端用于识别调用
 */
@Service(version = "${mydubbo.demo.service.version}")
public class UserServiceImpSpi implements UserServiceApi {

    @Autowired
    private UserService userService; //注入业务层service（非提供dubbo服务用的）

    @Override
    public UserBean getUser(Long id) {
        return userService.getUser(id);
    }

    @Override
    public List<UserBean> getAllUser() {
        return userService.getAll();
    }
}
