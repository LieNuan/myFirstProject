package com.example.demo.Service;

import org.springframework.stereotype.Service;
import com.example.demo.pojo.entity;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Mapper.UserMapper;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<entity> getAllUsers() {
        return userMapper.getAllUsers();

    }

    @Override
    public void deleteAllUsers(int id) {
        userMapper.deleteAllUsers(id);
    }

    @Override
    public void addUser(entity user) {
        user.setCreateTime(LocalDateTime.now());
        userMapper.addUser(user);

    }

    @Override
    public void updateUser(entity user) {
        user.setCreateTime(LocalDateTime.now());
        userMapper.updateUser(user);
    }
}
