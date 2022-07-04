package com.caogen.ad.controller;

import com.alibaba.fastjson.JSON;
import com.caogen.ad.annotation.IgnoreResponseAdvice;
import com.caogen.ad.client.SponsorClient;
import com.caogen.ad.client.vo.AdPlan;
import com.caogen.ad.client.vo.AdPlanGetRequest;
import com.caogen.ad.search.Search;
import com.caogen.ad.search.vo.SearchRequest;
import com.caogen.ad.search.vo.SearchResponse;
import com.caogen.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-01 15:06
 */
@Slf4j
@RestController
public class SearchController {

    private final RestTemplate restTemplate;

    private final SponsorClient sponsorClient;

    private final Search search;

    @Autowired
    public SearchController(RestTemplate restTemplate,
                            SponsorClient sponsorClient,
                            Search search) {
        this.restTemplate = restTemplate;
        this.sponsorClient = sponsorClient;
        this.search = search;
    }

    @IgnoreResponseAdvice
    @PostMapping("/getAdPlansByRibbon")
    public List<AdPlan> getAdPlansByRibbon(
            @RequestBody AdPlanGetRequest request) {
        log.info("ad-search: getAdPlansByRebbon -> {}",
                JSON.toJSONString(request));
        return restTemplate.postForEntity(
                "http://eureka-client-ad-sponsor/ad-sponsor/get/adPlan",
                request,
                List.class
        ).getBody();
    }

    @IgnoreResponseAdvice
    @PostMapping("/getAdPlansByFeign")
    public List<AdPlan> getAdPlansByFeign(
            @RequestBody AdPlanGetRequest request) {
        log.info("ad-search: getAdPlansByFeign -> {}",
                JSON.toJSONString(request));
        return sponsorClient.getAdPlans(request);
    }

    @PostMapping("/fetchAds")
    public SearchResponse fetchAds(@RequestBody SearchRequest request) {
        log.info("ad-search: fetchAds -> {}",
                JSON.toJSONString(request));
        return search.fetchAds(request);
    }

}
