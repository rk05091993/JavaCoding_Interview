package day4;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String input="()";
        boolean result=checkParenthesis(input);
        System.out.println(result);

    }

    private static boolean checkParenthesis(String input) {
        char inputArray[]=input.toCharArray();
        Stack<Character> stack=new Stack<Character>();
        for (char currentChar : inputArray) {
            if (currentChar == '(') {
                stack.push(currentChar);
            }
            else if (currentChar == ')') {
                if (stack.isEmpty()) {
                    return false;//mismatch occured ! No opening bracket present
                }
                else {
                    char topChar = stack.pop();
                    if (topChar!='(') {
                        return false;
                    }
                }
            }

        }
        return stack.isEmpty();
    }
}
