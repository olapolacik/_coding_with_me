import java.util.Scanner;

// program sprawdzajacy czy podana liczba
// jest parzysta czy nieparzysta

public class EvenOddNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Podana liczba jest parzysta");
        }
        else{
            System.out.println("Podana liczba jest nieparzysta");
        }
    }
}
