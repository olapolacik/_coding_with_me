// kalkulator prosty

import java.util.Scanner;

public class BasicCalculator {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj 1 liczbe: ");
        double num1 = sc.nextDouble();

        System.out.println("Podaj 2 liczbe: ");
        double num2 = sc.nextDouble();

        System.out.println("Jakie dzialanie chcesz wykonac? (+ - / *)");
        char operator = sc.next().charAt(0);

        Double result;

        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = "  + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.print(num1 + "/" + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            default:
                System.out.println("Podaj poprawny operator!");
        }
    }
}
