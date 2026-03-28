package day2;

public class PrintthelengthOfLastWord {
    public static void main(String[] args) {
        String str = "           Hello   World  Moon     ";
        System.out.println(str);
        //str =str.trim();
        //System.out.println(str);

        //store in char array
        int count = 0;
        char inputArray[] = str.toCharArray();
        for (int i = inputArray.length - 1; i >= 0; i--) {

            if (inputArray[i] != ' ') {

                count = count + 1;
            } else {
                if (count > 0) {
                    System.out.println(count);
                    break;
                }
            }


        }
    }
}
