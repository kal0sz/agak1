package zad1;

public class zad6 {
    public static void main(String[] args) {
        int sciana1 = 3;
        int sciana2 = 4;

        int pomieszczenie1 = (sciana1 * sciana2)/4 ;
        int pomieszczenie2 = (sciana1 * sciana2)/4;

        int sciana3 = 2;
        int sciana4 = 3;

        int pomieszczenie3 = (sciana3 * sciana4)/4;

        int sciana5 = 2;
        int sciana6 = 2;

        int pomieszczenie4 = (sciana5 * sciana6)/4;

        System.out.println("Powierzchnia pomieszczenia pierwszego i drugiego przypadająca na 1 osobę to : " + pomieszczenie1 +"m2");
        System.out.println("Powierzchnia pomieszczenia trzeciego wynosi przypadająca na 1 osobę to : " + pomieszczenie3+"m2");
        System.out.println("Powierzchnia pomieszczenia czwartego przypadająca na 1 osobę to : " + pomieszczenie4+"m2");
        System.out.println("Powierzchnia calkowita przypadająca na 1 osobę to: " + (pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4)+"m2");
    }
}
