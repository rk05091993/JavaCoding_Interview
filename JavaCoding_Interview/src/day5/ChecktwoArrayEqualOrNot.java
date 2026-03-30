package day5;

import java.util.Arrays;

public class ChecktwoArrayEqualOrNot {
    public static void main(String[] args) {

        int a1[]={ 1,2,3,4,5};
        int a2[]={ 1,2,3,4,5};

        //Approach-1 (inbuilt Method)
/*        boolean status = Arrays.equals(a1, a2);
        if(status){
            System.out.println("The two arrays are equal");
        }
        else {
            System.out.println("The two arrays are not equal");
        }*/

        //Approach-2 (without using inbuilt method)
        boolean status=true;
        if(a1.length==a2.length){
            for(int i=0;i<a1.length;i++){
                if(a1[i]!=a2[i]){
                    status=false;
                }
            }
        }
        else {
            status=false;
        }
        if(status==true){
            System.out.println("The two arrays are equal");
        }
        else {
            System.out.println("The two arrays are not equal");
        }
    }
}
