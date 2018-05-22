package com.yoonsikum.interview.day05;

/**
 * Created by yoonsikum on 2018. 5. 22..
 */
public class Solution2 {

    private int climbStairs(int n, int[] dp){
        if(dp[n]!=0) return dp[n];

        if (n == 1) return 1;
        if (n == 2) return 2;


        int sum = climbStairs(n-1, dp);
        sum += climbStairs(n-2, dp);
        dp[n] = sum;
        return sum;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int result = s.climbStairs(4, new int[5]);
        System.out.println(result);
    }


}
