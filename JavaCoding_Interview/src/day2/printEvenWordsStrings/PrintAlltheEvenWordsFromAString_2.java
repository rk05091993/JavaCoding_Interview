package day2.printEvenWordsStrings;

public class PrintAlltheEvenWordsFromAString_2 {
    public static void main(String[] args) {
        String input = "Sky is blue and vast";
        String data[] = input.split(" ");
        System.out.println(data.length);
        //using for loop
        for (int i = 0; i < data.length; i++) {
            String word = data[i];


            if (word.length() % 2 == 0) {
                System.out.println(word + " ==> even");
            } else {
                System.out.println(word + " ==> odd");
            }
        }
    }
}