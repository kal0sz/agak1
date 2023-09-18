package zadania2;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbe sekund: ");
        double s = klawiatura.nextDouble();

        double minuty = (s/60);
        double godziny = (s/3600);
        double dni = (s/86400);

        if(s>=60 && s<3600){
            System.out.printf("Liczba minut:%.2f ", minuty);
        }else if(s>=3600 && s<86400){
            System.out.printf("Liczba godzin:%.2f "  , godziny);
        }else if(s>=86400){
            System.out.printf("Liczba dni:%.2f "  , dni);
        }
    }
}
