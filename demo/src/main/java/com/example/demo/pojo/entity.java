package com.example.demo.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class entity {

    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private LocalDateTime createTime;
}
