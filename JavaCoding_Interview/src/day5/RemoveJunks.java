package day5;

public class RemoveJunks {
    public static void main(String[] args) {
        String s="@#$$@%$$@%$%~#@#!@ testing %$$@%$ Selenium !%$$@%$ %%%";

                s=s.replaceAll("[^a-zA-Z0-9]","");
               System.out.println(s);

    }
}
