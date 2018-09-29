package com.zookeeper.dubboserver.mapper;

import com.zookeeper.dubbo.bea.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //持久化注解，如果不添加注解，会提示红色下划线，但是编译和运行正常，只是很不爽
@Mapper    //有次注解，就不需要在启功类上添加mapper所在包的扫描了
public interface UserMapper {
    @Select("select * from my_users where user_id=#{id}")
    @Results({
            @Result(id=true,column = "user_id",property = "userId"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_pwd",property = "userPwd")
    })
    UserBean getUser(Long id);

    @Select("select * from my_users")
    @Results({
            @Result(id=true,column = "user_id",property = "userId"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_pwd",property = "userPwd")
    })
    List<UserBean> getAllUser();
}
