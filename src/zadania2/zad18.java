package zadania2;

import java.util.Scanner;

public class zad18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Czy któraś z osób jest na diecie wegetariańskiej? (tak/nie)");
        boolean wege = klawiatura.nextLine().equalsIgnoreCase("tak");

        System.out.println("Czy któraś z osób jest na diecie wegańskiej? (tak/nie)");
        boolean wegan = klawiatura.nextLine().equalsIgnoreCase("tak");

        System.out.println("Czy któraś z osób jest na diecie bezglutenowej? (tak/nie)");
        boolean glufree = klawiatura.nextLine().equalsIgnoreCase("tak");


        if(wege && wegan && glufree){
            System.out.println("Możecie wybrać sie do następującyh restauracji: ");
            System.out.println("1. Kawiarnia na Rogu");
            System.out.println("2. Kuchnia u Szefa");
        }else if(wege && wegan){
            System.out.println("Możecie wybrać sie do następującyh restauracji: ");
            System.out.println("1. Kawiarnia na Rogu");
            System.out.println("2. Kuchnia u Szefa");
        }else if(wege && glufree){
            System.out.println("Możecie wybrać sie do następującyh restauracji: ");
            System.out.println("1. Kawiarnia na Rogu");
            System.out.println("2. Kuchnia u Szefa");
            System.out.println("3. Pizzeria przy Dworcowej");
        }else if(wegan && glufree){
            System.out.println("Możecie wybrać sie do następującyh restauracji: ");
            System.out.println("1. Kawiarnia na Rogu");
            System.out.println("2. Kuchnia u Szefa");
        }else if(wege){
            System.out.println("Możecie wybrać sie do następującyh restauracji: ");
            System.out.println("1. Kawiarnia na Rogu");
            System.out.println("2. Kuchnia u Szefa");
            System.out.println("3. Pizzeria przy Dworcowej");
            System.out.println("4. Włoskie Specjały");
        }else if(wegan){
            System.out.println("Możecie wybrać sie do następującyh restauracji: ");
            System.out.println("1. Kawiarnia na Rogu");
            System.out.println("2. Kuchnia u Szefa");
        }else if(glufree){
            System.out.println("1. Kawiarnia na Rogu");
            System.out.println("2. Kuchnia u Szefa");
            System.out.println("3. Pizzeria przy Dworcowej");
        }else{
            System.out.println("Możecie wybrać sie do następującyh restauracji: ");
            System.out.println("1. Kawiarnia na Rogu");
            System.out.println("2. Kuchnia u Szefa");
            System.out.println("3. Pizzeria przy Dworcowej");
            System.out.println("4. Włoskie Specjały");
            System.out.println("5. Luksusowe Burgery u Jarka");
        }

    }
}
