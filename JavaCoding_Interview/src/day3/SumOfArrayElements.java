package day3;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int nums[] = {1, 24, 33, 44};
        int sum = 0;

        //using foreach loop
        for (int num : nums) {
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("The Sum of Array Elements is:  " + sum);

        //using for loop
       /*  for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            sum = sum + nums[i];

        }
        System.out.println("The Sum is:  " + sum);*/
    }
}