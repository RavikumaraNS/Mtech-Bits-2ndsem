package com.ns.trees;

import com.ns.trees.util.Node;

/*
Program to find left view of tree Binary tree. Means nodes visible seeing from left side of the tree.
Example
            1
        2      3
                  6

For the binary tree, the output would be 1,2,6

 */
public class FindLeftView {
    static  int levelPrinted = 0;
    public  static void  main (String[] args){

        Node root = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.rightNode.rightNode = new Node(6);


        findLeftView(root, 1);

    }

    static void findLeftView(Node node, int level){
          if (node == null){
              return;
          }
          if (levelPrinted < level){
              System.out.print(node.data + ",");
              levelPrinted = level;
          }
          findLeftView(node.leftNode, level+1);
          findLeftView(node.rightNode, level+1);
    }
}

