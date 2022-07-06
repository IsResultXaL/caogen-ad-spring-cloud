package com.caogen.ad.service;

import com.caogen.ad.SponsorTestApplication;
import com.caogen.ad.exception.AdException;
import com.caogen.ad.vo.AdPlanGetRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-06 17:45
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SponsorTestApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AdPlanServiceTest {

    @Autowired
    private AdPlanService planService;

    @Test
    public void testGetAdPlan() throws AdException {
        System.out.println(
                planService.getAdPlanByIds(
                        new AdPlanGetRequest(15L, Collections.singletonList(10L))
                )
        );
    }

}
