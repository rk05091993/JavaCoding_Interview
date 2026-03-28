package day3;

public class MoveAllZeroAtTheEndOfArray {
    public static void main(String[] args) {
        int a[] = {0, 3, 5, 0, 0, 0, 5, 9, 89, 78, 56};

        int nonZeroValue = 0;
        int temp;//it helps in swapping

        for (int current = 0; current < a.length; current++) {

            if (a[current] != 0) {
                //then swap
                temp = a[nonZeroValue];
                a[nonZeroValue] = a[current];
                a[current] = temp;
                nonZeroValue++;
                ;
            }


        }
        for (int no : a) {
            System.out.print(no + " ");
        }


    }
}
