package com.yoonsikum.interview.day01;

import java.util.Arrays;

/**
 * Created by yoonsikum on 2018. 5. 14..
 */
public class Solution1 {


    public int[] twoSum(int[] nums, int target) {


        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }

        return new int[]{};

    }



    public static void main(String[] args) {

        Solution1 s = new Solution1();

        int[] nums = new int[] {11, 15, 2, 1, 5, 4, 7};

        int[] twoSum = s.twoSum(nums, 9);

        System.out.println(Arrays.toString(twoSum));



    }


}
