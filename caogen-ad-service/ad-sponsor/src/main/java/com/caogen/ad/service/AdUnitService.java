package com.caogen.ad.service;

import com.caogen.ad.exception.AdException;
import com.caogen.ad.vo.*;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 18:06
 */
public interface AdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
            throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
            throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
            throws AdException;

}
