import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wynik z 1 testu: ");
        double test1 = klawiatura.nextDouble();

        System.out.println("Podaj wynik z 2 testu: ");
        double test2 = klawiatura.nextDouble();

        System.out.println("Podaj wynik z 3 testu: ");
        double test3 = klawiatura.nextDouble();

        double srednia = ((test1+test2+test3)/3);

        System.out.println("Twój wynik z pierwszego testu to: " + test1 + ", z drugiego: " + test2 + ", a z trzeciego: " + test3 + ". Tak więc twoja średnia wynosi: " + srednia);
    }
}

/*
. Napisz program, który wyświetla prośbę o wprowadzenie wyników z trzech testów.
Program powinien wyświetlać wyniki z każdego testu, a także średnią.
 */