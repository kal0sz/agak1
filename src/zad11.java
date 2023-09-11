import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wartosc produktu: ");
        double wart = klawiatura.nextDouble();

        double podStanowy = (wart*0.04);
        double podLokalny = (wart*0.02);

        System.out.println("Łączna cena sprzedaży wynosi: " + (wart + podStanowy + podLokalny) + "zł");
    }
}


/*
Napisz program, który wyświetla prośbę o wprowadzenie wartości kupowanego
produktu. Program ten powinien następnie obliczać podatek stanowy i lokalny od
sprzedaży. Załóżmy, że podatek stanowy wynosi 4%, a podatek lokalny to 2%.
Program powinien wyświetlać wartość produktu, podatek stanowy, podatek lokalny i
łączną cenę sprzedaży (czyli sumę wartości produktu i obu podatków od sprzedaży).
Wskazówka: Posłuż się wartością 0,02, aby przedstawić 2%, i wartością 0,04 do
reprezentowania 4%
 */