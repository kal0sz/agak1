package zadania2;

import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadz liczbe zakupionych pakietow: ");
        int pakiet = klawiatura.nextInt();

        double rabat1 = (pakiet * (0.2));
        double rabat2 = (pakiet * (0.3));
        double rabat3 = (pakiet * (0.4));
        double rabat4 = (pakiet * (0.5));

        double kwota1 = ((pakiet * 99) - rabat1);
        double kwota2 = ((pakiet * 99) - rabat2);
        double kwota3 = ((pakiet * 99) - rabat3);
        double kwota4 = ((pakiet * 99) - rabat4);

        if (pakiet >= 10 && pakiet < 20) {
            System.out.println("Poziom rabatu: 20%, łączna kwota zakupu po rabacie:" + kwota1);
        } else if (pakiet >= 20 && pakiet < 50) {
            System.out.println("Poziom rabatu: 30%, łączna kwota zakupu po rabacie:" + kwota2);
        } else if (pakiet >= 50 && pakiet < 100) {
            System.out.println("Poziom rabatu: 40%, łączna kwota zakupu po rabacie:" + kwota3);
        } else if (pakiet >= 100) {
            System.out.println("Poziom rabatu: 50%, łączna kwota zakupu po rabacie:" + kwota4);
        } else {
            System.out.println("Rabat nie zostal przyznany.");

        }
    }
}
