package com.yoonsikum.interview.day04;

/**
 * Created by yoonsikum on 2018. 5. 17..
 */
public class Solution1 {

    public int maxSubArray(int[] arr) {

        int maxSoFar=arr[0], maxEndingHere=arr[0];
        for (int i=1;i<arr.length;++i){
            maxEndingHere= Math.max(maxEndingHere+arr[i],arr[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;

    }


    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int result = s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(result);
    }
}
