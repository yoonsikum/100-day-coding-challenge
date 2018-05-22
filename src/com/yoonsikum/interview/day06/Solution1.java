package com.yoonsikum.interview.day06;

/**
 * Created by yoonsikum on 2018. 5. 22..
 */
public class Solution1 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }

    public static void main(String[] args) {
        //[1,2,2,3,4,4,3]
        //[1,2,2,null,3,null,3]

        Solution1 s = new Solution1();


        TreeNode root = new TreeNode(0);
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        TreeNode root2 = null;
        root2 = s.insertLevelOrder(arr, root, 0);
        s.inOrder(root2);



//        boolean symmetric = s.isSymmetric(transform(new Integer[]{1,2,2,3,4,4,3}));
//        System.out.printf(String.valueOf(symmetric));

    }



    // Function to insert nodes in level order
    public TreeNode insertLevelOrder(int[] arr, TreeNode root,
                                 int i)
    {
        // Base case for recursion
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }

    // Function to print tree nodes in InOrder fashion
    public void inOrder(TreeNode root)
    {
        if (root != null) {
            System.out.print(root.val + " ");
            inOrder(root.left);

            inOrder(root.right);
        }
    }



}
