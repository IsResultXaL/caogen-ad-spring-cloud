package com.caogen.ad.constant;

import lombok.Getter;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 11:43
 */
@Getter
public enum CreativeMetrialType {

    JPG(1, "jpg"),
    BMP(2, "bmp"),

    MP4(3, "mp4"),
    AVI(4, "avi"),

    TXT(5, "txt");

    private int type;
    private String desc;

    CreativeMetrialType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
