package day3;

public class CountVowels {
    public static void main(String[] args) {

        String input = "Hello World";

        // Step 1: count variable (vowels count karega)
        int count = 0;

        // Step 2: string ko lowercase me convert kar dete hain
        // taaki A aur a dono same treat ho
        input = input.toLowerCase();

        // Step 3: loop se har character traverse karo
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i); // current character

            // Step 4: check karo vowel hai ya nahi
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // vowel mila → count increase
            }
        }

        // Step 5: final result print
        System.out.println("Total vowels: " + count);
    }
}