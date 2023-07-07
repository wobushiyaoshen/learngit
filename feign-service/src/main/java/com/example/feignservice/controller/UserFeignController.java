package com.example.feignservice.controller;

import com.example.feignservice.domain.CommonResult;
import com.example.feignservice.domain.User;
import com.example.feignservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by macro on 2019/8/29.
 */
@RestController
@RequestMapping("/user")
public class UserFeignController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public CommonResult getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/getByUsername")
    public CommonResult getByUsername(@RequestParam String username) {
        return userService.getByUsername(username);
    }

    @PostMapping("/create")
    public CommonResult create(@RequestBody User user) {
        return userService.create(user);
    }

    @PostMapping("/update")
    public CommonResult update(@RequestBody User user) {
        return userService.update(user);
    }

    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @RequestMapping("/test")
    public void test() {
        System.out.println("111111111111");
        System.out.println("-----------");
        System.out.println("999999999999999999999");
        System.out.println("wwwwwwwwwwwwwwwwwwwwww");
    }

    @RequestMapping("/test2")
    public void test2() {
        System.out.println("2222222222222222222");
        System.out.println("-----------------------");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("9999999999999999");
        System.out.println("00000000000000000000000");
        System.out.println("$$$$$$$$$$$$$$$$$$");
    }


    @RequestMapping("testRevert")
    public void testRevert() {
        int a = 10;
        int b = 2;
        int c = a/b;
    }
}
