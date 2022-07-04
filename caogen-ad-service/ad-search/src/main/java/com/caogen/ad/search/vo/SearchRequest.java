package com.caogen.ad.search.vo;

import com.caogen.ad.search.vo.feature.DistrictFeature;
import com.caogen.ad.search.vo.feature.FeatureRelation;
import com.caogen.ad.search.vo.feature.ItFeature;
import com.caogen.ad.search.vo.feature.KeywordFeature;
import com.caogen.ad.search.vo.media.AdSlot;
import com.caogen.ad.search.vo.media.App;
import com.caogen.ad.search.vo.media.Device;
import com.caogen.ad.search.vo.media.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-04 16:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchRequest {

    // 媒体方请求标识
    private String mediaId;

    // 请求基本信息
    private RequestInfo requestInfo;

    // 匹配信息
    private FeatureInfo featureInfo;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RequestInfo{
        private String requestId;

        private List<AdSlot> adSlots;

        private App app;

        private Geo geo;

        private Device device;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FeatureInfo{
        private KeywordFeature keywordFeature;

        private DistrictFeature districtFeature;

        private ItFeature itFeature;

        private FeatureRelation relation = FeatureRelation.AND;
    }

}
