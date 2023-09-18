package zad1;

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę przejechanych km: ");
        double km = klawiatura.nextDouble();

        System.out.println("Podaj liczbę zużytych litrów paliwa: ");
        double l = klawiatura.nextDouble();

        double kmL = (km/l);

        System.out.println("Liczba km przejechanych na 1 litrze paliwa wynosi: " + kmL);

    }
}
