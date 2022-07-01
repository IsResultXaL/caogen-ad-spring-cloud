package com.caogen.ad.index;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-01 16:40
 */
public interface IndexAware<K, V> {

    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);
}
