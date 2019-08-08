package com.zxy.learning.arithmetic.simple;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName TransferNumber.java
 * @Description 翻转整数，https://leetcode-cn.com/problems/reverse-integer
 * @createTime 2019年03月04日 11:25:00
 */
public class TransferNumber {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int left = x % 10;
            x /= 10;
            //判断是否正数越界
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && left > 7)) {
                return 0;
            }
            //判断是否小数越界
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && left < -8)) {
                return 0;
            }
            result = result * 10 + left;
        }
        return result;
    }
}
