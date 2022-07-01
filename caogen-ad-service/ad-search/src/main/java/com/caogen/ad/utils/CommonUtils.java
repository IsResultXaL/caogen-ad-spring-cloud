package com.caogen.ad.utils;

import java.util.Map;
import java.util.function.Supplier;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-01 17:05
 */
public class CommonUtils {

    public static <K, V> V getorCreate(K key, Map<K, V> map, Supplier<V> factory) {
        return map.computeIfAbsent(key, k -> factory.get());
    }

}
