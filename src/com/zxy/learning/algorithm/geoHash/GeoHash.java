package com.zxy.learning.algorithm.geoHash;

import java.util.BitSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName GeoHash.java
 * @Description
 * @createTime 2019年07月24日 16:02:00
 */
public class GeoHash {

    //编码长度
    private static int numberBits = 3 * 3;

    //编码字符
    final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p',
            'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    private static Map<Character, Integer> map = new ConcurrentHashMap<>(64);

    private BitSet getBits(double lat, double left, double right) {
        BitSet buffer = new BitSet(numberBits);
        for (int i = 0; i < numberBits; i++) {
            double mid = (left + right) / 2;
            if (lat >= mid) {
                buffer.set(i);
                left = mid;
            } else {
                right = mid;
            }
        }
        return buffer;
    }

    public static void main(String[] args){
        GeoHash geoHash = new GeoHash();
        System.out.println(geoHash.encode(512d, 512d));
        System.out.println(geoHash.encode(510d, 510d));
        System.out.println(geoHash.encode(511d, 511d));
        System.out.println(geoHash.encode(510d, 511d));
        System.out.println(geoHash.encode(511d, 510d));

        System.out.println(geoHash.encode(0d, 512d));
        System.out.println(geoHash.encode(256d, 256d));
        System.out.println(geoHash.encode(512d, 0d));

        System.out.println(geoHash.encode(0d, 0d));
    }


    public String encode(double lat, double lon) {
        BitSet latbits = getBits(lat, 0, 512);
        BitSet lonbits = getBits(lon, 0, 512);
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < numberBits; i++) {
            buffer.append((lonbits.get(i)) ?'1':'0');
            buffer.append((latbits.get(i)) ?'1':'0');
        }
        return base32(Long.parseLong(buffer.toString(), 2));
    }

    private String base32(long i) {
        char[] buf = new char[65];
        int charPos = 64;

        while (i >= 32) {
            buf[charPos --] = digits[(int) ((i % 32))];
            i /= 32;
        }
        buf[charPos] = digits[(int) (i)];


      /*  boolean negative = (i < 0);
        if (!negative) {
            i = -i;
        }
        while (i <= -32) {
            buf[charPos--] = digits[(int) (-(i % 32))];
            i /= 32;
        }
        buf[charPos] = digits[(int) (-i)];

        if (negative) {
            buf[--charPos] = '-';
        }*/
        return new String(buf, charPos, (65 - charPos));
    }
}
