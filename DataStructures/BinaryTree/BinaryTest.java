package com.ankesh.learning.DataStructures.BinaryTree;

public class BinaryTest {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(1);
        tree.insert(5);
        tree.insert(6);
        tree.insert(30);
        tree.insert(29);
        tree.insert(400);


        System.out.println("Before Innverting =========");
        tree.printTreeByLevel(tree.root);
        System.out.println("After Innverting =========");
        tree.invertTree(tree.root);
        tree.printTreeByLevel(tree.root);
    }
}