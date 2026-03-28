package day3;

public class CountVowels_2 {
    public static void main(String[] args) {

        String input = "Hello World";

        // Step 1: char array me convert (tere previous approach jaisa)
        char[] arr = input.toLowerCase().toCharArray();

        int count = 0;

        // Step 2: array traverse karo
        for (char ch : arr) {

            // Step 3: vowel check
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Step 4: print result
        System.out.println("Total vowels: " + count);
    }
}