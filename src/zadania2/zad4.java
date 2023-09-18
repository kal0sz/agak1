package zadania2;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wynik pierwszego testu(w %): ");
        double test1 = klawiatura.nextDouble();

        System.out.println("Podaj wynik drugiego testu(w %): ");
        double test2 = klawiatura.nextDouble();


        System.out.println("Podaj wynik trzeciego testu(w %): ");
        double test3 = klawiatura.nextDouble();

        double srednia = ((test1+test2+test3)/3);

        if(srednia>=90){
            System.out.println("srednia: " + srednia + "%" + " ocena:" + "5");
        }else if(srednia>=80){
            System.out.println("srednia: " + srednia + "%" + " ocena:" + "4");
        }else if(srednia>=70){
            System.out.println("srednia: " + srednia + "%" + " ocena:" + "3");
        }else if(srednia>=60){
            System.out.println("srednia: " + srednia + "%" + " ocena:" + "2");
        }else{
            System.out.println("srednia: " + srednia + "%" + " ocena:" + "1");
        }


    }
}
