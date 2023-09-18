package zadania2;

import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wybierz litere reprezentującą wybrany przez siebie pakiet:");
        String pakiet = klawiatura.nextLine();

        System.out.println("Podaj liczbę minut rozmów:");
        int minuty = klawiatura.nextInt();

        if (pakiet.equals("a") && minuty <= 450) {
            System.out.println("Łączna opłata za ten miesiąc wynosi: 39,99zł ");
        } else if (pakiet.equals("a") && minuty > 450) {
            double oplata = (39.99 + ((minuty - 450) * 0.45));
            System.out.println(" Łączna opłata za ten miesiąc wynosi: " + oplata + "zł");
        } else if (pakiet.equals("b") && minuty <= 900) {
            System.out.println("Łączna opłata za ten miesiąc wynosi: 59,99zł ");
        } else if (pakiet.equals("b") && minuty > 900) {
            double oplata = (59.99 + ((minuty - 900) * 0.40));
            System.out.println(" Łączna opłata za ten miesiąc wynosi: " + oplata + "zł");
        } else if (pakiet.equals("c")) {
            System.out.println("Łączna opłata za ten miesiąc wynosi: 69,99zł ");
        }
    }
}
