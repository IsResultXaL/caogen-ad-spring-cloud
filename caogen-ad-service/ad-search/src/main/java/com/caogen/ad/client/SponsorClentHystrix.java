package com.caogen.ad.client;

import com.caogen.ad.client.vo.AdPlan;
import com.caogen.ad.client.vo.AdPlanGetRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-01 16:21
 */
@Component
public class SponsorClentHystrix implements SponsorClient{
    @Override
    public List<AdPlan> getAdPlans(AdPlanGetRequest request) {
        return new ArrayList<>();
    }
}
