package com.caogen.ad.controller;

import com.alibaba.fastjson.JSON;
import com.caogen.ad.exception.AdException;
import com.caogen.ad.service.CreativeService;
import com.caogen.ad.vo.CreativeRequest;
import com.caogen.ad.vo.CreativeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 19:01
 */
@Slf4j
@RestController
public class CreativeOPController {

    private final CreativeService creativeService;

    @Autowired
    public CreativeOPController(CreativeService creativeService) {
        this.creativeService = creativeService;
    }

    @PostMapping("/create/creative")
    public CreativeResponse createCreative(
            @RequestBody CreativeRequest request
    ) throws AdException {
        log.info("ad-sponsor: createCreative -> {}",
                JSON.toJSONString(request));
        return creativeService.createCreative(request);
    }

}
