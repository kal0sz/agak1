package zadania2;

import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj nazwisko pierwszego biegacza: ");
        String zaw1 = klawiatura.nextLine();

        System.out.println("Podaj nazwisko drugiego biegacza: ");
        String zaw2 = klawiatura.nextLine();

        System.out.println("Podaj nazwisko trzeciego biegacza: ");
        String zaw3 = klawiatura.nextLine();

        System.out.println("Podaj czas ukończenia biegu (w minutach) biegacza o nazwisku: " + zaw1);
        Double czas1 = klawiatura.nextDouble();

        System.out.println("Podaj czas ukończenia biegu (w minutach) biegacza o nazwisku: " + zaw2);
        Double czas2 = klawiatura.nextDouble();

        System.out.println("Podaj czas ukończenia biegu (w minutach) biegacza o nazwisku: " + zaw3);
        Double czas3 = klawiatura.nextDouble();


        if (czas1 < czas2 && czas1 < czas3 && czas2 < czas3) {
            System.out.println(zaw1 + ", " + zaw2 + ", " + zaw3);
        } else if (czas1 < czas2 && czas1 < czas3 && czas2 > czas3) {
            System.out.println(zaw1 + ", " + zaw3 + ", " + zaw2);
        } else if (czas2 < czas1 && czas2 < czas3 && czas1 < czas3) {
            System.out.println(zaw2 + ", " + zaw1 + ", " + zaw3);
        } else if (czas2 < czas1 && czas2 < czas3 && czas3 < czas1) {
            System.out.println(zaw2 + ", " + zaw3 + ", " + zaw1);
        } else if (czas3 < czas2 && czas3 < czas1 && czas2 < czas1) {
            System.out.println(zaw3 + ", " + zaw2 + ", " + zaw1);
        } else if (czas3 < czas2 && czas3 < czas1 && czas2 > czas1) {
            System.out.println(zaw3 + ", " + zaw1 + ", " + zaw2);

        }
    }
}
