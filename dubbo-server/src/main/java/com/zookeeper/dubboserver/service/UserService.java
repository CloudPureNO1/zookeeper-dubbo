package com.zookeeper.dubboserver.service;

import com.zookeeper.dubbo.bea.UserBean;

import java.util.List;

public interface UserService {
    UserBean getUser(Long id);
    List<UserBean> getAllUser();
}
