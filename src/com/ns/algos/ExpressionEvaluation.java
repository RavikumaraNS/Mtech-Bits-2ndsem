package com.ns.algos;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*
Evaluate balanced brackets in an expression
* */
public class ExpressionEvaluation {


    public static void main(String[] args) {

      // String inputString = "[()]{}{[()()]()}";
       String inputString = "[]]]";
        System.out.println("Evaluate: " + evaluate(inputString));
        
    }

    private  static boolean evaluate(String str){
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack();
        Deque<Character> stack1 = new ArrayDeque<Character>();
        int len = -1 ;
        boolean isBalanced = true;
        if (chars.length % 2 == 0) {
            while (++len < chars.length) {
                if (chars[len] == '[' || chars[len] == '(' || chars[len] == '{') {
                    stack.push(chars[len]);
                    continue;
                }

                if(stack.isEmpty()) return  false;
                switch (chars[len]) {
                    case ']':
                        if (!stack.pop().equals('[')) return false;
                        break;
                    case ')':
                        if (!stack.pop().equals('(')) return false;
                        break;
                    case '}':
                        if (!stack.pop().equals('{')) return false;
                        break;
                    default:
                        break;
                }

            }
        }  else {
            isBalanced = false;
        }
        return  (stack.isEmpty() && isBalanced) ? true : false;
    }

}
