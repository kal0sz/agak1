package zadania2;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wybierz:(powietrze, woda lub stal):");
        String nosnik = klawiatura.nextLine();

        System.out.println("Podaj odległość (w m):");
        double odleglosc = klawiatura.nextDouble();

        double czas;

        switch (nosnik.toLowerCase()) {
            case "powietrze":
                czas = odleglosc / 343.0;
                System.out.println("Czas potrzebny na pokonanie odległości w powietrzu: " + czas + " s");
                break;
            case "woda":
                czas = odleglosc / 1490.0;
                System.out.println("Czas potrzebny na pokonanie odległości w wodzie: " + czas + " s");
                break;
            case "stal":
                czas = odleglosc / 5100.0;
                System.out.println("Czas potrzebny na pokonanie odległości w stali: " + czas + " s");
                break;
            default:
                System.out.println("Nieprawidłowy nośnik. Wybierz spośród: powietrze, woda lub stal.");
        }

    }
}
