package com.zookeeper.dubboserver.spi;

import com.alibaba.dubbo.config.annotation.Service;
import com.zookeeper.dubbo.api.UserServiceApi;
import com.zookeeper.dubbo.bea.UserBean;
import com.zookeeper.dubboserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "${demo.service.version}")
public class UserServiceSpi implements UserServiceApi {
    @Autowired
   private UserService userService;


    @Override
    public UserBean getUser(Long id) {
        return userService.getUser(id);
    }

    @Override
    public List<UserBean> getAllUser() {
        return userService.getAllUser();
    }
}
