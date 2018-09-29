package com.zookeeper.dubbo.bea;

import lombok.Data;

@Data
public class UserBean implements java.io.Serializable{
    private Long userId;
    private String userName;
    private String userPwd;
}
