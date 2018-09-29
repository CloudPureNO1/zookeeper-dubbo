package com.zookeeper.dubbo.dubboprovider.service.imp;


import com.zookeeper.dubbo.bea.UserBean;
import com.zookeeper.dubbo.dubboprovider.mapper.UserMapper;
import com.zookeeper.dubbo.dubboprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service  org.springframework.stereotype.Service  是spring 业务层的@Service注解，不是dubbo的，要与dubbo服务的注解区别
 * 此处单独有非dubbo服务的service层，所以dubbo服务的都放在了另外的spi包中，且类后都添加Spi,以示区别
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;  //注入mybatis  的借口（UserMapper);

    @Override
    public UserBean getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<UserBean> getAll() {
        return userMapper.getAll();
    }
}
