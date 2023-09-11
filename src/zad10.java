import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Twoje imię: ");
        String firstName = klawiatura.nextLine();

        System.out.println("Twoje drugie imię: ");
        String middleName = klawiatura.nextLine();

        System.out.println("Twoje nazwisko: ");
        String lastName = klawiatura.nextLine();

char firstInitial = firstName.charAt(0);
char middleInitial = middleName.charAt(0);
char lastInitial = lastName.charAt(0);

        System.out.println("Twoje inicjały to: " + firstInitial + middleInitial + lastInitial);

    }
}
