package com.joy.ad.index;

/**
 * Created by SongLiang on 2019-10-07
 */
public interface IndexAware<K, V> {

    V get(K key);

    void add(K key, V value);

    void update(K key, V value);

    void delete(K key, V value);

}
