import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę zjedzonych ciasteczek: ");
        double liczba = klawiatura.nextDouble();


        int zawartosc = 40;
        int pudelkoKcal = 3000;
        int porcjaKcal = 300;
        //jedna porcja to 4 ciasteczka

        int jednoCiasteczko = (300/4);

        double kcal = (jednoCiasteczko*liczba);

        System.out.println("Skonsumowałeś " + kcal + " kcal");

    }
}
