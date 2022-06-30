package com.caogen.ad.controller;

import com.alibaba.fastjson.JSON;
import com.caogen.ad.exception.AdException;
import com.caogen.ad.service.UserService;
import com.caogen.ad.vo.CreateUserRequest;
import com.caogen.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 12:25
 */
@Slf4j
@RestController
public class UserOPController {

    private final UserService userService;

    @Autowired
    public UserOPController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create/user")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request) throws AdException {
        log.info("ad-sponsor: createUser -> {}", JSON.toJSONString(request));
        return userService.createUser(request);
    }
}
