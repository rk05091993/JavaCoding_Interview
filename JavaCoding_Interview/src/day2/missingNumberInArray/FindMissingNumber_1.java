package day2.missingNumberInArray;

public class FindMissingNumber_1 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 5, 6};
        //approach-1
        int totalNumbers = 6;
        int totalSumOfAllNumbers = (totalNumbers * (totalNumbers + 1)) / 2;
        System.out.println("the Total sum of All Numbers: " + totalSumOfAllNumbers);

        //calculate total sum of given array
        int sumOfArray = 0;
        for (int i = 0; i < numbers.length; i++) {

            sumOfArray = sumOfArray + numbers[i];

        }
        System.out.println("The Sum of given  Array: " + sumOfArray);
        System.out.println("The Missing number is: " + (totalSumOfAllNumbers - sumOfArray));
    }
}
