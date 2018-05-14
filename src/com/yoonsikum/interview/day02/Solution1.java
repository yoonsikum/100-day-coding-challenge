package com.yoonsikum.interview.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by yoonsikum on 2018. 5. 15..
 */
public class Solution1 {


    private Map<Character, Character> parenthesesMap = new HashMap<>();
    {
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');
        parenthesesMap.put('(', ')');
    }




    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        int length = s.length();


        for (int i = 0; i < length; i++) {

            char c = s.charAt(i);

            if (parenthesesMap.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                Character top = stack.pop();
                if (parenthesesMap.get(top).equals(c)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }



    public static void main(String[] args) {


        Solution1 s = new Solution1();
        System.out.println("() : " + s.isValid("()"));
        System.out.println("(){} : " + s.isValid("(){}"));
        System.out.println("([]) : " + s.isValid("([])"));
        System.out.println("([)] : " + s.isValid("([)]"));


    }
}
