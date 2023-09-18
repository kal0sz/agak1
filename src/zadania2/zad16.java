package zadania2;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ile książek zakupiłeś w tym miesiącu:");
        int ksiazki = klawiatura.nextInt();

        if(ksiazki==0){
            System.out.println("Liczba przyznanych punktów: 0");
        }else if(ksiazki==1){
            System.out.println("Liczba przyznanych punktów: 5");
        }else if(ksiazki==2){
            System.out.println("Liczba przyznanych punktów: 15");
        }else if(ksiazki==3){
            System.out.println("Liczba przyznanych punktów: 30");
        }else{
            System.out.println("Liczba przyznanych punktów: 60");
        }
    }
}
