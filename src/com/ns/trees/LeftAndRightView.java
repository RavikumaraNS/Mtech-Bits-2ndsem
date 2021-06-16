package com.ns.trees;

/*
Program to find left view  and right view of tree Binary tree. Means starting from left corner leaf node to right corner
leaf node. i.e., outline
Example  1:
            1
        2      3
                  6

For the binary tree, the output would be 2,1,3,6

Example 2:

          1
       2      3
    4    5  6   7

output -> 4,2,1,3,7
 */

import com.ns.trees.util.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class LeftAndRightView {

    public  static void main(String[] args){
        Node root = new Node(1);
        root.leftNode = new Node (2);
        root.rightNode = new Node(3);
        root.rightNode.rightNode = new Node(6);
        List<Integer> list = new ArrayList<>();
        View tree = new View();
        tree.leftView(root, 1, list);
        tree.levelVisited = 0;
        Collections.reverse(list);
        tree.rightview(root.rightNode, 1,list);

        for (Integer item: list) {
            System.out.print(item.intValue()+ " ");
        }
    }

}

class  View{
    int levelVisited = 0;
    void leftView(Node node,int level, List<Integer> list){

        if (!Optional.ofNullable(node).isPresent())   return;

        if (levelVisited < level){
            levelVisited = level;
            list.add(node.data);
        }
        leftView(node.leftNode, level+1,list);
    }

    void rightview(Node node, int level, List<Integer> list){
        if (!Optional.ofNullable(node).isPresent()) return;

        if (levelVisited < level){
            levelVisited = level;
            list.add(node.data);
        }

        rightview(node.rightNode, level+1, list);
    }
}
