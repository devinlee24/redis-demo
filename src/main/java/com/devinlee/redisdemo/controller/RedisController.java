package com.devinlee.redisdemo.controller;

import com.devinlee.redisdemo.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private IRedisService redisService;


    @GetMapping("/redisString")
    public void redisString() {
        this.redisService.redisString();
    }

    @GetMapping("/redisHash")
    public void redisHash() {
        this.redisService.redisHash();
    }

    @GetMapping("/redisSet")
    public void redisSet() {
        this.redisService.redisSet();
    }

    @GetMapping("/redisList")
    public void redisList() {
        this.redisService.redisList();
    }

    @GetMapping("/redisSortedSet")
    public void redisSortedSet() {
        //有序的set，故而省略
    }
}
