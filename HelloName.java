import java.util.Scanner;

// pobieranie danych od użytkownika
// retrieving data from the user

public class HelloName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
    }   
}
