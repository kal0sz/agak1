package zadania2;

import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadz liczbe kalorii: ");
        double kl = klawiatura.nextDouble();

        System.out.println("Wprowadz liczbe gramow tluszczu: ");
        double tl = klawiatura.nextDouble();

        double kltl = (tl*9);
        double procentkltl = (kltl/kl);

        if(kltl<30){
            System.out.println("Kalorie pochodzące z tłuszczu: " +procentkltl + "%, produkt niskotłuszczowy");
        }else if(kltl>kl){
            System.out.println("Dane wejściowe są nieprawidlowe");
        }else{
            System.out.println("Kalorie pochodzące z tłuszczu: " + procentkltl + "%");
        }
    }
}
