package com.caogen.ad.client;


import com.caogen.ad.client.vo.AdPlan;
import com.caogen.ad.client.vo.AdPlanGetRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-01 16:14
 */
@FeignClient(value = "eureka-client-ad-sponsor", fallback = SponsorClentHystrix.class)
public interface SponsorClient {

    @PostMapping(value = "ad-sponsor/get/adPlan")
    List<AdPlan> getAdPlans(@RequestBody AdPlanGetRequest request);

}
