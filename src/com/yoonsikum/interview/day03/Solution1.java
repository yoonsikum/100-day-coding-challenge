package com.yoonsikum.interview.day03;

/**
 * Created by yoonsikum on 2018. 5. 16..
 */
public class Solution1 {

    public ListNode mergeTwoLists(ListNode n1, ListNode n2) {

//        if (n1 == null) return n2;
//        if (n2 == null) return n1;
//
//        if (n1.val < n2.val) {
//            n1.next = mergeTwoLists(n1.next, n2);
//            return n1;
//        } else {
//            n2.next = mergeTwoLists(n2.next, n1);
//            return n2;
//        }

//        ListNode result = null;
//
//        if(n1 != null && n2 != null) {
//            if(n1.val < n2.val) {
//                result = n1;
//                result.next = mergeTwoLists(n1.next, n2);
//            } else {
//                result = n2;
//                result.next = mergeTwoLists(n1, n2.next);
//            }
//
//        }
//        else if(n1!=null ){
//            result=n1;
//        }
//        else if(n2!=null){
//            result=n2;
//        }
//        return result;

        ListNode result = null;

        if(n1 != null && n2 != null) {
            if(n1.val < n2.val) {
                result = n1;
                result.next = mergeTwoLists(n1.next, n2);
            } else {
                result = n2;
                result.next = mergeTwoLists(n1, n2.next);
            }
        } else if (n1 != null) {
            result = n1;  // Add all the elements of `n1` to `result`
        } else if (n2 != null) {
            result = n2;  // Add all the elements of `n2` to `result`
        }

        return result;



    }


    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        ListNode n5 = new ListNode(5);
        ListNode n7 = new ListNode(7);
        ListNode n9 = new ListNode(9);

        n1.next = n3;
        n3.next = n5;
        n5.next = n7;
        n7.next = n9;
        n9.next = null;

        ListNode n2 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        ListNode n6 = new ListNode(6);
        ListNode n8 = new ListNode(8);
        ListNode n10 = new ListNode(10);

        n2.next = n4;
        n4.next = n6;
        n6.next = n8;
        n8.next = n10;
        n10.next = null;

        System.out.println("Merge : " + new Solution1().mergeTwoLists(n1, n2));

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
    @Override
    public String toString() {
        ListNode cur = this;
        String str = "";

        while(cur != null) {
            str += cur.val+"->";
            cur = cur.next;
        }

        return str;
    }


}