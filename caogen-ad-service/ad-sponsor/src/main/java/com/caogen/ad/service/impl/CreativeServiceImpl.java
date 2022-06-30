package com.caogen.ad.service.impl;

import com.caogen.ad.dao.CreativeRepository;
import com.caogen.ad.entity.Creative;
import com.caogen.ad.exception.AdException;
import com.caogen.ad.service.CreativeService;
import com.caogen.ad.vo.CreativeRequest;
import com.caogen.ad.vo.CreativeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 18:46
 */
@Slf4j
@Service
public class CreativeServiceImpl implements CreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) throws AdException {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }

}
