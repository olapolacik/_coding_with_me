// program obliczajacy ludzkie lata psa!

import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jakiej wielkosci jest Twoj pies? (maly/duzy/sredni)");
        String dogSize = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ile lat ma Twoj pies? ");
        int dogYears = sc2.nextInt();

        if(dogSize.equals("maly") && dogYears > 0){
            System.out.println("Twoj pies ma " + dogYears * 5 + " ludzkich lat!");
        }
        else if(dogSize.equals("sredni") && dogYears > 0){
            System.out.println("Twoj pies ma " + dogYears * 6 + " ludzkich lat!");
        }
        else if(dogSize.equals("duzy") && dogYears > 0){
            System.out.println("Twoj pies ma " + dogYears * 7 + " ludzkich lat!");
        }
        else{
            System.out.println("Podaj poprawny wiek i wielkosc!");
        }
    }
}

// create by _coding_with_me
