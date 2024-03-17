package StackEx;

import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Влад");
        stack.push("Глеб");
        stack.push("Женя");
        stack.push("Анатолий");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }


    }

}
