package com.caogen.ad.search.vo.media;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-04 16:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdSlot {

    // 广告位编码
    private String adSlotCode;

    // 流量类型
    private Integer positionType;

    private Integer width;

    private Integer height;

    // 广告物料类型：图片 视频
    private List<Integer> type;

    // 广告最低出价
    private Integer minCpm;

}
