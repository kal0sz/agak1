package zad1;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź cenę detaliczna płytki: ");
        double detal = klawiatura.nextDouble();

        double zysk = (detal*0.4);

        System.out.println("Zysk ze sprzedaży tej płytki wynosi: " + zysk + "zł");
    }
}
