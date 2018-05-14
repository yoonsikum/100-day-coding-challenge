package com.yoonsikum.interview.day02;

import java.util.Stack;

/**
 * Created by yoonsikum on 2018. 5. 15..
 */
public class Solution2 {


    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                Character top = stack.pop();
                if (c == ')' && top == '(') {
                    continue;
                }
                if (c == '}' && top == '{') {
                    continue;
                }
                if (c == ']' && top == '[') {
                    continue;
                }
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {


        Solution2 s = new Solution2();
        System.out.println("() : " + s.isValid("()"));
        System.out.println("(){} : " + s.isValid("(){}"));
        System.out.println("([]) : " + s.isValid("([])"));
        System.out.println("([)] : " + s.isValid("([)]"));


    }


}
