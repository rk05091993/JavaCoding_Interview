package day2.missingNumberInArray;

public class FindMissingNumber_2 {
    public static void main(String[] args) {
        //Approach-2 using bitwise operator (xor operator)

        int number[] = {1, 2, 4, 5, 6};
        int missingNumber = 0;

        for (int no : number) {
            missingNumber = missingNumber ^ no;//xor

        }
        for (int i = 0; i <= 6; i++) {
            missingNumber = missingNumber ^ i;//xor
        }
        System.out.println("The Missing Number is:  " + missingNumber);
    }
}
