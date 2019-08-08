package com.zxy.learning.arithmetic.medium;

import java.util.*;

/**
 * @author zxy
 * @version 1.0.0
 * @ClassName ThreeSum.java
 * @Description  https://leetcode-cn.com/problems/3sum/
 * @createTime 2019年03月08日 16:39:00
 */
public class ThreeSum {

    public static void main(String[] args){
        int[] arrays = {-6,-5,-5,-4,-4,-3,-3,-2,-2,-1,-1,0,0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
        for(List<Integer> temp : threeSumByDoublePoint(arrays)){
            for(Integer obj :temp){
                System.out.print(obj + ",");
            }
            System.out.println(" ");
        }
    }
    public static int LIMIT_LENGTH = 3;

    public static List<List<Integer>> threeSumByDoublePoint(int[] nums){
        List<List<Integer>> result = new LinkedList<>();
        int length = nums.length;
        if(length < LIMIT_LENGTH){
            return result;
        }
        Arrays.sort(nums);
        for(int one = 0; one < length - 2; one++){
            int two = one + 1, three = length - 1, target = - nums[one];
            while(two < three){
                int sum = nums[two] + nums[three];
                if(sum == target){
                    List<Integer> single = new ArrayList<>();
                    single.add(nums[one]);
                    single.add(nums[two]);
                    single.add(nums[three]);
                    result.add(single);
                    two++;
                    three--;
                } else if(sum < target){
                    two++;
                } else {
                    three--;
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        if(nums.length < 3){
            return result;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map= new HashMap<>(nums.length);
        for(int index = 0; index < nums.length -1; index ++){
            map.put(0-nums[index], index);
        }
        int maxNegativeNum = -(nums[0] + nums[1]);
        int endIndex = nums.length;
        int firstTemp = maxNegativeNum;
        for(int i = 0; i< endIndex - 3  ; i++){

            if(firstTemp == nums[i] || nums[i] > 0){
                continue;
            }
            firstTemp = nums[i];
            int secondTemp = maxNegativeNum;
            for(int j = i + 1; j < endIndex - 2; j++){
                List<Integer> singleResult = new LinkedList<>();
                if(secondTemp == nums[j] || (nums[i] == 0 && nums[j] > 0)){
                    continue;
                }
                secondTemp = nums[j];
                if(secondTemp > maxNegativeNum){
                    endIndex = j;
                }
                Integer index = map.get(nums[i] + nums[j]);
                if(index != null && index != i && index != j){
                    singleResult.add(nums[i]);
                    singleResult.add(nums[j]);
                    singleResult.add(nums[index]);
                    result.add(singleResult);
                }
            }
        }

        return result;
    }

}
