import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź cenę posiłku: ");
        double cena = klawiatura.nextDouble();

        double podatek = (cena*0.0675);
        double napiwek = (cena*0.2);
        double suma = (cena + podatek + napiwek);

        System.out.println("Cena posiłku: " + cena + ",wartość podatku: " + podatek + ",wysokość napiwku: " + napiwek + ",kwota do zapłaty: " + suma);

    }
}

