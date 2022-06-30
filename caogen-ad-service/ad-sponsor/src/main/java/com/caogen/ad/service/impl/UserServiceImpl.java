package com.caogen.ad.service.impl;

import com.caogen.ad.constant.Constants;
import com.caogen.ad.dao.AdUserRepository;
import com.caogen.ad.entity.AdUser;
import com.caogen.ad.exception.AdException;
import com.caogen.ad.service.UserService;
import com.caogen.ad.utils.CommonUtils;
import com.caogen.ad.vo.CreateUserRequest;
import com.caogen.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 12:09
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final AdUserRepository userRepository;

    @Autowired
    public UserServiceImpl(AdUserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {

        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdUser oldUser = userRepository.findByUsername(request.getUsername());
        if (oldUser != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

        AdUser newUser = userRepository.save(new AdUser(
                request.getUsername(),
                CommonUtils.md5(request.getUsername())
        ));

        return new CreateUserResponse(
                newUser.getId(), newUser.getUsername(), newUser.getToken(),
                newUser.getCreateTime(), newUser.getUpdateTime()
        );
    }
}
