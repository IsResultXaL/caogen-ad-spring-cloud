package com.caogen.ad.constant;

import lombok.Getter;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 11:43
 */
@Getter
public enum CreativeType {

    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
