package com.caogen.ad.constant;

import lombok.Getter;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 11:17
 */
@Getter
public enum CommonStatus {

    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;

    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
