import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
//pokoj1
        System.out.println("Podaj dlugosc pokoju nr 1: ");
        double dlug1 = klawiatura.nextDouble();

        System.out.println("Podaj szerokosc pokoju nr 1: ");
        double szer1 = klawiatura.nextDouble();

        double pomieszczenie1 = (szer1 * dlug1)/4 ;
//pokoj2
        System.out.println("Podaj dlugosc pokoju nr 2: ");
        double dlug2 = klawiatura.nextDouble();

        System.out.println("Podaj szerokosc pokoju nr 2: ");
        double szer2 = klawiatura.nextDouble();

        double pomieszczenie2 = (szer2 * dlug2)/4 ;
//pokoj3
        System.out.println("Podaj dlugosc pokoju nr 3: ");
        double dlug3 = klawiatura.nextDouble();

        System.out.println("Podaj szerokosc pokoju nr 3: ");
        double szer3 = klawiatura.nextDouble();

        double pomieszczenie3 = (szer3 * dlug3)/4 ;
//pokoj4
        System.out.println("Podaj dlugosc pokoju nr 4: ");
        double dlug4 = klawiatura.nextDouble();

        System.out.println("Podaj szerokosc pokoju nr 4: ");
        double szer4 = klawiatura.nextDouble();

        double pomieszczenie4 = (szer4 * dlug4)/4 ;

        System.out.println("Powierzchnia pomieszczenia pierwszego przypadająca na 1 osobę to : " + pomieszczenie1 +"m2");
        System.out.println("Powierzchnia pomieszczenia drugiego przypadająca na 1 osobę to : " + pomieszczenie2+"m2");
        System.out.println("Powierzchnia pomieszczenia trzeciego wynosi przypadająca na 1 osobę to : " + pomieszczenie3+"m2");
        System.out.println("Powierzchnia pomieszczenia czwartego przypadająca na 1 osobę to : " + pomieszczenie4+"m2");
        System.out.println("Powierzchnia calkowita przypadająca na 1 osobę to: " + (pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4)+"m2");
    }
}
