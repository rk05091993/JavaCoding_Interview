package day4;

import java.util.Stack;

public class ValidParentheses_2 {
    public static void main(String[] args) {

        // Input string jisme brackets ko validate karna hai
        String input = "{[()]}";

        // Function call → check karega string valid hai ya nahi
        boolean result = checkParenthesis(input);

        // Final result print (true = valid, false = invalid)
        System.out.println(result);
    }

    private static boolean checkParenthesis(String input) {

        // String ko char array me convert kiya
        // Kyuki string immutable hoti hai aur traversal easy hota hai array me
        char inputArray[] = input.toCharArray();

        // Stack banaya
        // Reason: Hume last opened bracket ko track karna hai
        // Stack LIFO hota hai → Last In First Out
        Stack<Character> stack = new Stack<>();

        // Har character pe loop chalega
        for (char currentChar : inputArray) {

            // ===============================
            // CASE 1: Opening bracket mila
            // ===============================
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {

                // Opening bracket ko stack me push karo
                // Kyuki iska closing future me aayega
                stack.push(currentChar);
            }

            // ===============================
            // CASE 2: Closing bracket mila
            // ===============================
            else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {

                // Agar stack empty hai
                // Matlab closing bracket aaya lekin opening mila hi nahi
                if (stack.isEmpty()) {
                    return false; // invalid
                }

                // Last opening bracket nikaalo
                // (LIFO → jo last open hua wahi pehle close hona chahiye)
                char topChar = stack.pop();

                // ===============================
                // Matching check
                // ===============================

                // Agar current closing bracket ka matching opening nahi hai
                if ((currentChar == ')' && topChar != '(') ||
                        (currentChar == ']' && topChar != '[') ||
                        (currentChar == '}' && topChar != '{')) {

                    // Mismatch → invalid
                    return false;
                }
            }

            // (Ignore any other characters if present)
        }

        // ===============================
        // FINAL CHECK
        // ===============================

        // Agar stack empty hai → sab opening ka closing mil gaya
        // Agar stack me kuch bacha → kuch opening close nahi hua
        return stack.isEmpty();
    }
}

//👉 Push opening → Pop & match on closing → End me stack empty = valid