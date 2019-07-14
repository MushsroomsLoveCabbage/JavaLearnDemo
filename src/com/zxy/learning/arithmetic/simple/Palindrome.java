package com.zxy.learning.arithmetic.simple;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName Palindrome.java
 * @Description TODO https://leetcode-cn.com/problems/palindrome-number/
 * @createTime 2019年03月06日 16:02:00
 */
public class Palindrome {
    /**
     * @Title
     * @Description  小于0/尾数为0， 0-9，  取一半，偶数正常，奇数再除10
     * @Author zxy
     * @Param [x]
     * @UpdateTime 2019/3/6 18:43
     * @Return boolean
     * @throws
     */
    public static boolean isPalindrome(int x) {
        if(x < 0 || x % 10 == 0) {
            return false;
        }
        if(10 > x && x >= 0 ) {
            return true;
        }

        int halfNumer = 0;
        while(halfNumer < x){
            halfNumer = halfNumer * 10 + x%10;
            x /= 10;
        }
        if(halfNumer == x || halfNumer/10 == x ) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args){
        System.out.println( isPalindrome(10));
        System.out.println( isPalindrome(11));
        System.out.println( isPalindrome(121));
        System.out.println( isPalindrome(123411));
        System.out.println( isPalindrome(142143));
        System.out.println( isPalindrome(1133443311));
        System.out.println( isPalindrome(134565431));
        System.out.println( isPalindrome(1111111111));

    }
}
