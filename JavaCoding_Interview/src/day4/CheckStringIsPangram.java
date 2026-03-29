package day4;

public class CheckStringIsPangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog ";

        // 1) Lower case
        input = input.toLowerCase();
        //System.out.println(input);

        boolean result = checkPangram(input);

        if (result) {
            System.out.println("Its a pangram");
        } else {
            System.out.println("Its not a pangram");
        }
    }

    private static boolean checkPangram(String input) {
        //Checking the length of string
        if (input.length() < 26) {
            return false;
        }

        for (char i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) < 0) {  // It will check if the index of any character is less than 0 ie -1
                return false;
            }
        }
        return true;
    }
}