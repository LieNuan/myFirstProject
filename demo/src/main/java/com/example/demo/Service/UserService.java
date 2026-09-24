package com.example.demo.Service;

import com.example.demo.pojo.entity;

import java.util.List;

public interface UserService {

    List<entity> getAllUsers();

    void deleteAllUsers( int id);

    void addUser(entity user);

    void updateUser(entity user);
}
