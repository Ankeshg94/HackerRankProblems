package com.ankesh.learning.DataStructures.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
    BinaryNode root;

    void insert(int data) {
        if (root == null) {
            this.root = new BinaryNode(data);
            return;
        }
        BinaryNode prev = root;
        BinaryNode curr = root;
        while (curr != null) {
            prev = curr;
            curr = data > curr.data ? curr.right : curr.left;
        }

        if (data > prev.data) {
            prev.right = new BinaryNode(data);
        } else {
            prev.left = new BinaryNode(data);
        }
    }

    public BinaryNode invertTree(BinaryNode root) {

        if (root == null) {
            return root;
        }

        invertTree(root.left);
        invertTree(root.right);

        //swap
        BinaryNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }


    void printTreeByLevel(BinaryNode root) {
        BinaryNode curr = root;
        Queue<BinaryNode> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                root = q.remove();
                System.out.print(root.data + " ");
                if (root.left != null) {
                    q.add(root.left);
                }
                if (root.right != null) {
                    q.add(root.right);
                }
            }
            System.out.println("");
        }
    }
}
