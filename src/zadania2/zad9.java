package zadania2;

import java.util.Scanner;

public class zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadz wage przesylki(kg): ");
        double waga = klawiatura.nextDouble();

        System.out.println("Wprowadz odleglosc(km): ");
        double km = klawiatura.nextDouble();

        double koszt;

        if(waga <= 1){
            koszt = 1.10 * km;
        }else if(waga <= 3){
            koszt = 2.20 * km;
        }else if(waga <= 5){
            koszt = 3.70 * km;
        }else{
            koszt = 3.80 * km;
        }

        System.out.println("Koszt przesylki wynosi: " + koszt + "zł");

        klawiatura.close();
    }
}
