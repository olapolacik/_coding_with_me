// random lotto number!
// losujemy 6 liczb z 49

import java.util.Random;

public class LottoNumber {
    public static void main(String[] args) {
        Random rand = new Random();

        int maxNum = 50;
        int randomNum = rand.nextInt(maxNum);

        System.out.println("Twoje szczescliwe numery to: " + randomNum);

    }
}
