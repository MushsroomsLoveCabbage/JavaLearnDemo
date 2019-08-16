package com.zxy.learning.cache;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName LRUK.java
 * @Description 最近使用次数最少
 * @createTime 2019年08月09日 13:32:00
 */
public class LRUK<K, V> {

    private static final float hashLoad = 0.75f;

    private LinkedHashMap<K, V> cacheMap;

    private int cacheSize;

    private HashMap<K, Integer> frequencyMap;

    private int limitFrequency;

    public LRUK(int cacheSize, int limitFrequency) {
        this.cacheSize = cacheSize;
        this.limitFrequency = limitFrequency;
        int capacity = (int)Math.ceil(cacheSize / hashLoad ) + 1;
        cacheMap = new LinkedHashMap<K, V>(capacity, hashLoad, true){

            private static final long serialVersionUID = 1;

            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > LRUK.this.cacheSize;
            }
        };
        frequencyMap =  new HashMap<>();
    }

    public synchronized V get(K key) {
        return cacheMap.get(key);
    }

    public synchronized void put(K key, V value) {
        cacheMap.put(key, value);
    }

    public synchronized void clear() {
        cacheMap.clear();
    }

    public synchronized int usedSize() {
        return cacheMap.size();
    }
}
