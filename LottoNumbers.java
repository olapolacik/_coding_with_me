// random lotto number!
// lucky 6 numbers

import java.util.Random;

public class LottoNumbers {
    public static void main(String[] args) {

        Random num = new Random();

        int minNum = 1;
        int maxNum = 49;

        System.out.println("Your lucky numbers is: ");
        for(int i = 0; i  <= 5; i++) {
            int luckyNum = num.nextInt(maxNum - minNum) + minNum;
            System.out.println("Num: " + luckyNum);
        }
    }
}

// create by _coding_with_me