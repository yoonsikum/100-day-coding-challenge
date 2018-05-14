package com.yoonsikum.interview.day01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yoonsikum on 2018. 5. 14..
 */
public class Solution2 {


    private Map<Integer, Integer> map = new HashMap<>();



    public int[] twoSum(int[] nums, int target) {



        int length = nums.length;

        map.put(nums[0], 0);


        for (int i = 1; i < length - 1; i++) {

            map.put(nums[i], i);

            int j = target - nums[i];

            if (map.containsKey(j)) {
                return new int[] {map.get(j), i};
            }

        }

        return new int[]{};

    }



    public static void main(String[] args) {

        Solution2 s = new Solution2();

        int[] nums = new int[] {11, 15, 2, 1, 5, 4, 7};

        int[] twoSum = s.twoSum(nums, 9);

        System.out.println(Arrays.toString(twoSum));



    }

}
