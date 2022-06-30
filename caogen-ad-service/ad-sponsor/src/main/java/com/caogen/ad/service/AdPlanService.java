package com.caogen.ad.service;

import com.caogen.ad.entity.AdPlan;
import com.caogen.ad.exception.AdException;
import com.caogen.ad.vo.AdPlanGetRequest;
import com.caogen.ad.vo.AdPlanRequest;
import com.caogen.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 16:56
 */
public interface AdPlanService {

    /**
     * 创建推广计划
     *
     * @param request
     * @return
     * @throws AdException
     */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 获取推广计划
     *
     * @param request
     * @return
     * @throws AdException
     */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * 更新推广计划
     *
     * @param request
     * @return
     * @throws AdException
     */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 删除推广计划
     *
     * @param request
     * @return
     * @throws AdException
     */
    AdPlanResponse deleteAdPlan(AdPlanRequest request) throws AdException;
}
