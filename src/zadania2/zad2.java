package zadania2;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

            System.out.println("Podaj dzien(w formie liczby): ");
            int day = klawiatura.nextInt();

            System.out.println("Podaj miesiac(w formie liczby): ");
            int month = klawiatura.nextInt();

            System.out.println("Podaj 2 ostatnie cyfry roku: ");
            int year = klawiatura.nextInt();

            int mag = (day*month);

        if (mag==year) {
            System.out.println("Data jest magiczna.");
        } else {
            System.out.println("Data nie jest magiczna.");
        }
    }
}
