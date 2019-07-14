package com.zxy.learning.arithmetic.simple;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName NqueenQuestion.java
 * @Description TODO
 * @createTime 2019年03月15日 18:29:00
 */
public class NqueenQuestion {

    public void handle(int k, int n){
        String[][] result = new String[1<<2][k];
        getNextStep(1,1, k, n);
        getNextStep(1,-1, k, n);

    }

    public void getNextStep(int i,int resut, int k, int n){
        while(i <= k){
            int i1 = resut+2*i;
            int i2 = resut-2*i;
            int i3 = resut+2*i+1;
            int i4 = resut-2*i-1;

            if(i == k ){
                if(i1 == n){
                    System.out.println("+");
                }
                if(i2 == n){
                    System.out.println("-");
                }
                if(i3 == n){

                }
                if(i4 == n){

                }
            }
            getNextStep(i+1,i+2*i, k, n);
            getNextStep(i+1,i-2*i, k, n);
            getNextStep(i+1,i+2*i+1, k, n);
            getNextStep(i+1,i-2*i-1, k, n);
        }
    }

    public static void main(String[] args){
        int i = 1;
        while( i < 2){
            i++;
            System.out.println("---------");
        }
    }
}
