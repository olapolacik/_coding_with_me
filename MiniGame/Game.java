package MiniGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int i = 0;
    int answer;

    public void getNum(){
        Random rand = new Random();
        int num = rand.nextInt(15) + 1;
        Scanner sc = new Scanner(System.in);

        do{
            i++;
            System.out.print("Podaj liczbe: ");
            answer = sc.nextInt();
            if (answer > num) {
                System.out.println("Moja liczba jest mniejsza!");
            } else if(answer < num) {
                System.out.println("Moja liczba jest wieksza!");
            }
        }while(answer != num);
        System.out.println("Gratulacje, zgadles za " + i + " razem :)");
    }
}
