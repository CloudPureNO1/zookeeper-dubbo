package com.zookeeper.dubboserver.service.imp;


import com.zookeeper.dubbo.bea.UserBean;
import com.zookeeper.dubboserver.mapper.UserMapper;
import com.zookeeper.dubboserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service  //此处是spirng @Service 注解
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper mapper;
    @Override
    public UserBean getUser(Long id) {
        return mapper.getUser(id);
    }

    @Override
    public List<UserBean> getAllUser() {
        return mapper.getAllUser();
    }
}
