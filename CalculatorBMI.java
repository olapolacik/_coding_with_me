import java.util.Scanner;
import static java.lang.Math.*;

// program do obliczenia BMI!
public class CalculatorBMI {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Podaj swoj wzrost: ");
        double wzrost = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Podaj swoja wage: ");
        double waga = sc2.nextDouble();

        double BMI = waga / Math.pow(wzrost/100, 2);
        System.out.println("Twoje BMI wynosi: ");
        System.out.format("%.2f%n", BMI);

        System.out.println("Interpretacja wyniku: ");
        if(BMI <= 18.5){
            System.out.print("niedowaga");
        }
        else if(BMI <= 24.9){
            System.out.println("waga prawidlowa");
        }
        else if(BMI < 29.9){
            System.out.println("nadwaga");
        }
        else if(BMI <= 34.9){
            System.out.println("otylosc 1 stopnia");
        }
        else if(BMI <= 39.9){
            System.out.println("otylosc 2 stopnia");
        }
        else{
            System.out.println("otylosc 3 stopnia");
        }
    }
}
