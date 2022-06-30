package com.caogen.ad.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-06-30 12:21
 */
public class CommonUtils {

    public static String md5(String value) {
        return DigestUtils.md5Hex(value).toUpperCase();
    }

}
