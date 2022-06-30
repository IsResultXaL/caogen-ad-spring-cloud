package com.caogen.ad.service;

import com.caogen.ad.exception.AdException;
import com.caogen.ad.vo.CreateUserRequest;
import com.caogen.ad.vo.CreateUserResponse;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 12:03
 */
public interface UserService {

    /**
     * 创建用户
     * @param request
     * @return
     * @throws AdException
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;

}
