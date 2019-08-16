package com.zxy.learning.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName LRU.java
 * @Description LRU 缓存 (对于周期性的，偶然性的数据，命中率不高，缓存污染(没起到很好的缓存作用)严重)
 * @createTime 2019年03月06日 20:55:00
 */
public class LRU<K, V> {

    private static final float hashLoad = 0.75f;

    private LinkedHashMap<K, V> cacheMap;

    private int cacheSize;

    public LRU(int cacheSize) {
        this.cacheSize = cacheSize;
        int capacity = (int)Math.ceil(cacheSize / hashLoad ) + 1;
        cacheMap = new LinkedHashMap<K, V>(capacity, hashLoad, true){

            private static final long serialVersionUID = 1;

            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > LRU.this.cacheSize;
            }
        };
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

    public static void main(String[] args){
        LRU<String, String> lru =  new LRU<>(8);
        lru.put("1","1");
        lru.put("2","2");
        lru.put("3","3");
        lru.put("4","4");
        lru.put("5","5");
        lru.put("6","6");
        lru.put("7","7");
        lru.put("8","8");

        lru.get("8");
        lru.get("7");
        lru.get("6");
        lru.get("5");
        lru.get("4");
        lru.get("3");
        lru.put("9","9");

        lru.cacheMap.entrySet().forEach((obj)->{
            System.out.print(obj.getValue());
        });
        //System.out.print(lru.get("2"));
    }

}
