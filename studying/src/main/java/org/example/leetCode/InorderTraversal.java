package org.example.leetCode;

import java.util.ArrayList;

public class InorderTraversal {
    public static void main(String[] args) {

    }

    List<Integer> arr = new List<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root!=null) {
            inorderTraversal(root.left);
            arr.add(root.val);
            inorderTraversal(root.right);
        }
        return arr;
    }
}
