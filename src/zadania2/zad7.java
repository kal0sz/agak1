package zadania2;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj pierwsze imie: ");
        String imie1 = klawiatura.nextLine();

        System.out.println("Podaj drugie imie: ");
        String imie2 = klawiatura.nextLine();

        System.out.println("Podaj trzecie imie: ");
        String imie3 = klawiatura.nextLine();


        if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0 && imie2.compareToIgnoreCase(imie3) < 0 ) {
            System.out.println(imie1 + ", " + imie2 + ", " + imie3);
        } else if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0 && imie2.compareToIgnoreCase(imie3) > 0 ) {
            System.out.println(imie1 + ", " + imie3 + ", " + imie2);
        } else if (imie2.compareToIgnoreCase(imie1) < 0 && imie2.compareToIgnoreCase(imie3) <0 && imie3.compareToIgnoreCase(imie1) <0){
            System.out.println(imie2 + ", " + imie3 + ", " + imie1);
        } else if (imie2.compareTo(imie3) < 0 && imie2.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie1) >0) {
            System.out.println(imie2 + ", " + imie1 + ", " + imie3);
        } else if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie2) <0 && imie1.compareToIgnoreCase(imie2) <0){
            System.out.println(imie3 + ", " + imie1 + ", " + imie2);
        } else if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie2) <0 && imie1.compareToIgnoreCase(imie2) >0){
            System.out.println(imie3 + ", " + imie2 + ", " + imie1);

    }
    }
}
