package zadania2;

import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

            System.out.println("Podaj liczbę czeków wystawionych w tym miesiącu:");
            int czek = klawiatura.nextInt();

            if (czek < 20) {
                double dod = (10 + (czek * 0.1));
                System.out.println("Opłaty pobrane przez bank w tym miesiącu: " + dod + "zł");
            } else if (czek >= 20 && czek < 40) {
                double dod = (10 + (czek * 0.08));
                System.out.println("Opłaty pobrane przez bank w tym miesiącu: " + dod + "zł");
            } else if (czek >= 40 && czek < 60) {
                double dod = (10 + (czek * 0.06));
                System.out.println("Opłaty pobrane przez bank w tym miesiącu: " + dod + "zł");
            } else if (czek > 60) {
                double dod = (10 + (czek * 0.04));
                System.out.println("Opłaty pobrane przez bank w tym miesiącu: " + dod + "zł");
            }
        }
    }

