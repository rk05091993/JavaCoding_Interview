package day4;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("Apple");
        stack.push("Orange");

        System.out.println(stack);
        String top = stack.peek();
        System.out.println(top);
        String remove = stack.pop();
        System.out.println(remove);
        String top1 = stack.peek();
        System.out.println(top1);
        boolean check = stack.isEmpty();
        System.out.println(check);


    }
}
