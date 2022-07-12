import java.util.Scanner;
import static java.lang.Math.*;

// program do obliczenia BMI!
public class CalculatorBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj swoj wzrost: ");
        double wzrost = sc.nextDouble();

        System.out.println("Podaj swoja wage: ");
        double waga = sc.nextDouble();

        double bmi = waga / Math.pow(wzrost/100, 2);
        System.out.println("Twoje BMI wynosi: ");
        System.out.format("%.2f%n", bmi);

        System.out.print("Interpretacja wyniku: ");
        if(bmi <= 18.5){
            System.out.println("niedowaga");
        }
        else if(bmi <= 24.9){
            System.out.println("waga prawidlowa");
        }
        else if(bmi <= 29.9){
            System.out.println("nadwaga");
        }
        else if(bmi <= 34.9){
            System.out.println("otylosc 1 stopnia");
        }
        else if(bmi <= 39.9){
            System.out.println("otylosc 2 stopnia");
        }
        else{
            System.out.println("otylosc 3 stopnia");
        }
    }
}