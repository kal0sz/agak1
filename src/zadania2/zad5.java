package zadania2;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj mase obiektu: ");
        double masa = klawiatura.nextDouble();

        double N = (masa*(9.6));

        if(N>1000){
            System.out.println("Obiekt jest zbyt ciezki");
        }else if(N<10){
            System.out.println("Obiekt jest za lekki");
        }else{
            System.out.println("Ciezar w normie");
        }


    }
}
