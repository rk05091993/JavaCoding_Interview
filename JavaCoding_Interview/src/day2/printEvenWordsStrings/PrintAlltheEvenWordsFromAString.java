package day2.printEvenWordsStrings;

public class PrintAlltheEvenWordsFromAString {
    public static void main(String[] args) {
        String input = "Sky is blue and vast";
        String data[] = input.split(" ");
        //using for each loop
        for (String word : data) {
            //System.out.println(word);
            //int length = word.length();
            if (word.length() % 2 == 0) { //optimised code

                System.out.println(word + " ==> even");
            } else {
                System.out.println(word + " ==> odd");
            }
        }

    }
}
