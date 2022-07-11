import java.util.Scanner;

// program sprawdzajacy czy rok podany przez uzytkownika 
// jest rokiem przestepnym

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rok: ");

        int year = sc.nextInt();
        sc.close();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Podany rok jest przestepny");
        }
        else {
            System.out.println("Podany rok nie jest przestepny");
        }
    }
}

