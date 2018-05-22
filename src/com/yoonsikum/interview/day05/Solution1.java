package com.yoonsikum.interview.day05;

/**
 * Created by yoonsikum on 2018. 5. 22..
 */
public class Solution1 {

    public int climbStairs(int n) {

        if(n<=2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;


        for(int i=3; i<=n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];

    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int result = s.climbStairs(40);
        System.out.println(result);
    }

}
