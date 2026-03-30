package day5;

import java.util.Arrays;

public class SortArrayBubblesort {
    public static void main(String[] args) {
        int a[]={4,2,1,5,3};
        System.out.println("Before sorting array: "+ Arrays.toString(a));
        int n=a.length;//count the total array

        for(int i=0;i<n-1;i++)//Number of passes(n-1)
        {
            for(int j=0;j<n-1;j++)//iteration in each pass
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting array: "+ Arrays.toString(a));

    }
}
