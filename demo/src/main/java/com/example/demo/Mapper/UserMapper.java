package com.example.demo.Mapper;

import com.example.demo.pojo.entity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
        // 查询所有用户
    @Select("SELECT id, name, age, email, create_time createTime FROM user")
    List<entity> getAllUsers();

    @Delete("delete from user where id = #{id}")
    void deleteAllUsers(int id);

    @Insert("INSERT INTO user (name, age,email,create_time) VALUES (#{name}, #{age}, #{email}, #{createTime})")
    void addUser(entity user);

    @Update("UPDATE user SET name = #{name}, age = #{age}, email = #{email}, create_time = #{createTime} WHERE id = #{id}")
    void updateUser(entity user);

    //新增用户
//    @Insert("INSERT INTO user (name, age) VALUES (#{name}, #{age})")
//    void insertUser(entity user);

}
