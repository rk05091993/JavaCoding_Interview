package day5;

public class MaxAndMinElementsInArray {
    public static void main(String[] args) {
        int a[]={12,3,56,7,34,1,67};

        int max=a[0]; //consider 0th element max
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max) {
            max=a[i];
        }

        }
        System.out.println("Maximum number in array is :"+max);

   //Min value
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min) {
                min=a[i];
            }
        }
        System.out.println("Minimum number in array is :"+min);

    }
}
