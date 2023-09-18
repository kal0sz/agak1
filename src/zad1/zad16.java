package zad1;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź nazwę swojego ulubionego miasta: ");
        String miasto = klawiatura.nextLine();

        int liczbaZnakow = miasto.length();

        String male, wielkie;

        wielkie = miasto.toUpperCase();
        male = miasto.toLowerCase();

        char pierwszaLitera = miasto.charAt(0);

        System.out.println(liczbaZnakow + ", " + wielkie + ", " + male + ", " + pierwszaLitera);

    }
}
