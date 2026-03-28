package day1;

public class ReverseAnInteger {
    public static void main(String[] args) {
        int number = 214748;//declaration and intialization
        int reverseNumber = 0;
        int lastDigit;
        while (number != 0) {

            lastDigit = number % 10; //for remainder

            //check for overflow
            if (reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                System.out.println(0);
                return;
                // System.exit(0);//overflow return 0
            }

            if (reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                System.out.println(0);
                return;
                // System.exit(0); //underflow return 0
            }

            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10; //for quoitent if quoitent becomes 0 then while loop will exit

        }
        System.out.println(reverseNumber);

    }
}
