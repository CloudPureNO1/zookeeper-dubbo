package com.zookeeper.dubbo.dubboprovider.mapper;

import com.zookeeper.dubbo.bea.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //没有这个注解，idea中会提示红色下划线，但是编译和运行正常，只是看着不爽。
@Mapper //有这个注解，就不需要在启动类中添加扫描
public interface UserMapper {
    @Select("select * from my_users where user_id=#{id}")
    @Results({//如果没有results结果集配置，查询正常，但是没有内容
            @Result(id=true,column = "user_id",property = "userId"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_pwd",property = "userPwd")
    })
    UserBean getUser(Long id);

    @Select("select * from my_users")
    @Results({//如果没有results结果集配置，查询正常，但是没有内容
            @Result(id=true,column = "user_id",property = "userId"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "user_pwd",property = "userPwd")
    })
    List<UserBean>getAll();
}
