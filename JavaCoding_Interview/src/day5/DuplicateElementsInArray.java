package day5;

import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
       // int a[]={1,2, 5, 6,7,7,2};
        String a[]={"java","C","C++","Python","java"};



        //Approach-1
    /*    boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)//It will compare other elements
            {
                if(a[i]==a[j])
                {
                    System.out.println("Found Duplicate Element in Array: "+ a[i]);
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("Duplicate Elements not found");
        }*/

        //Approach-2 ( using Hash set )

        HashSet<String> set = new HashSet<>();
        boolean flag = false;

        for (String s : a) {   // ✅ array pe loop
            if (set.add(s) == false) {
                System.out.println("Found duplicate element: " + s);
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("Not found duplicates");
        }


    }
}

