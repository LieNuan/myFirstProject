package com.example.demo.Controller;

import com.example.demo.Service.UserServiceImpl;
import com.example.demo.pojo.Result;
import com.example.demo.pojo.entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public Result list() {
        log.info("list");
        List<entity> user = userService.getAllUsers();
        return Result.success(user);
    }

    @DeleteMapping( "/{id}")
    public Result delete( @PathVariable int id) {
        log.info("delete");
        userService.deleteAllUsers(id);
        return Result.success();
    }

    @PostMapping("/{id}")
    public Result add(@PathVariable int id, @RequestBody entity user) {
        log.info("add");
        userService.addUser(user);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody entity user){
        log.info("update");
        userService.updateUser(user);
        return Result.success();
    }




}
