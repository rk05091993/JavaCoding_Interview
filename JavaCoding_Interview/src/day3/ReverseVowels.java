package day3;

public class ReverseVowels {
    public static void main(String[] args) {
        String input = "Hello";//Holle
        // input.toLowerCase();
        //1 declare the vowels
        String vowels = "aeiouAEIOU"; //covering both uppercase and lower case

        //2 Convert String to array (Traverse)
        char inputArray[] = input.toCharArray();

        //3  create Two pointers approach
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (vowels.indexOf(inputArray[left]) == -1) {
                left++;
            } else if (vowels.indexOf(inputArray[right]) == -1) {
                right--;

            }
            //swaping
            else {
                char temp;
                temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Output: " + new String(inputArray));
    }
}
