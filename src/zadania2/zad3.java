package zadania2;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj swoją wagę(kg): ");
        double waga = klawiatura.nextDouble();

        System.out.println("Podaj swój wzrost(m): ");
        double wzrost = klawiatura.nextDouble();

        double bmi = (waga/(wzrost*wzrost));

        if (bmi<18.5) {
            System.out.println("Niedowaga");
        } else if (bmi>25){
            System.out.println("Nadwaga");
        } else {
            System.out.println("Waga prawidłowa");
        }


    }
}
