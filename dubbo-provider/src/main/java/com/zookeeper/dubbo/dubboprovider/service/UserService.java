package com.zookeeper.dubbo.dubboprovider.service;

import com.zookeeper.dubbo.bea.UserBean;

import java.util.List;

public interface UserService {
    UserBean getUser(Long id);
    List<UserBean>getAll();
}
