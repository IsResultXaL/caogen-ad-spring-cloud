package com.caogen.ad.service;

import com.caogen.ad.exception.AdException;
import com.caogen.ad.vo.CreativeRequest;
import com.caogen.ad.vo.CreativeResponse;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 18:45
 */
public interface CreativeService {

    CreativeResponse createCreative(CreativeRequest request) throws AdException;

}
