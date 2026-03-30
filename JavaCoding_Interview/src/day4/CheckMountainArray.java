package day4;

public class CheckMountainArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 6, 3, 1, 0,};

        System.out.println(mountainarrayCheck(a));

    }
        private static boolean mountainarrayCheck( int[] a){
        //1) Length of the array must be greater than 2 (it should be minimum 3)
       if(a.length < 3) //If not than it is not mountain array
       {
           return false;
        }
       //2) Element must be increasing order!! not duplicate
            int i=0;
       while (i+1<a.length && a[i]<a[i+1])
       {
           i++;
       }
       //the element should be increasing and when reached peak it should  strictly decrease
       while(i+1<a.length && a[i]>a[i+1])
       {
           i++;
       }
           if(a.length-1==i)
           {
               return true;// it is mountain array

           }
           else {
               return false;
           }
    }
}