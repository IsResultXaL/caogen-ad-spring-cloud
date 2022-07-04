package com.caogen.ad.index;

import lombok.Getter;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-04 15:04
 */
@Getter
public enum DataLevel {

    LEVEL2("2", "Level 2"),
    LEVEL3("3", "Level 3"),
    LEVEL4("4", "Level 4");

    private String level;

    private String desc;

    DataLevel(String level, String desc) {
        this.level = level;
        this.desc = desc;
    }

}
