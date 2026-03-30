package day5;

public class SumOfElementInArray {
    public static void main(String[] args) {
        int a[]={5,2,7,9,6};
        int sum=0;
        //for loop
       /* for(int i=0;i<a.length;i++){
            sum+=a[i];
            //sum=sum+a[i];
        }*/

        //for each loop
        for (int i : a) {
            sum+=i;
            //sum=sum+i

        }
        System.out.println("The sum of array is:"+ sum);
    }
}
