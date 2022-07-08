import java.util.Scanner;

// program sprawdzający czy jesteś pełnoletni
// Age veryfication programm

public class AgeVeryfication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ile masz lat? ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Jestes pelnoletni");
        }
        else if(age < 18){
            System.out.println("Nie jestes pelnoletni!");
        }
    }
}
