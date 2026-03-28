package day3;

public class SecondLargestElementInAArray {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 7, 5};
        int largestNo = Integer.MIN_VALUE;
        // System.out.println(largestNo);
        int secondLargestNo = Integer.MIN_VALUE;

        for (int num : a) {

            if (num > largestNo) {
                secondLargestNo = largestNo;
                largestNo = num;
            } else if (num > secondLargestNo && num != largestNo) {
                secondLargestNo = num;

            }


        }
        System.out.println("Second Largest No:" + secondLargestNo);
    }
}
