package com.caogen.ad.dao;

import com.caogen.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 11:48
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * 根据用户名查找用户数据
     * @param username
     * @return
     */
    AdUser findByUsername(String username);

}
