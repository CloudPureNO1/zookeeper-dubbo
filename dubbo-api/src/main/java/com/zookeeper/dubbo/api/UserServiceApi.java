package com.zookeeper.dubbo.api;

import com.zookeeper.dubbo.bea.UserBean;

import java.util.List;

public interface UserServiceApi {
    UserBean getUser(Long  id);
    List<UserBean> getAllUser();
}
