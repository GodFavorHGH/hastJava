package com.haugv.mapper;

import com.haugv.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    int createUser(User user);

    User getUser(@Param("id") int id);

}
