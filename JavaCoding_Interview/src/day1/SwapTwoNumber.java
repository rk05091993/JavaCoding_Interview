package day1;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swap a=" + a);
        System.out.println("Before Swap b=" + b);
        //Solution-1 (using temp variable)=In this approach we use extra memory space by creating temp variable
/*        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap a="+a);
        System.out.println("After Swap b="+b);*/
//=====================================================================================
        //Solution-2( Using Mathematical operation)
      /*  a=a+b;
        //System.out.println("a "+a);

        b=a-b;
        System.out.println("After swap b ="+b);

        a=a-b;
        System.out.println("After swap a ="+a);*/
//=====================================================================================
        //Soution-3(bitwise operator Exor operator)--Most optimised and preffered solution
        //0-0-->0 | 1-1-->0 | 0-1-->1
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap a=" + a);
        System.out.println("After Swap b=" + b);

    }
}
