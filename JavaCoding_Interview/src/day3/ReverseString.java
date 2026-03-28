package day3;

public class ReverseString {
    public static void main(String[] args) {

        String input = "hello";

        // Step 1: String ko char array me convert karte hain
        char[] arr = input.toCharArray();

        // Step 2: Two pointer define karo
        int left = 0;                 // start se
        int right = arr.length - 1;   // end se

        // Step 3: jab tak left < right tab tak swap
        while (left < right) {

            // Step 4: swap logic
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Step 5: pointers move karo
            left++;
            right--;
        }

        // Step 6: char array ko wapas string me convert
        System.out.println("Reversed String: " + new String(arr));
    }
}