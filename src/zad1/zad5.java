package zad1;

public class zad5 {
    public static void main(String[] args) {
        int sciana1 = 3;
        int sciana2 = 4;

        int pomieszczenie1 = sciana1 * sciana2;
        int pomieszczenie2 = sciana1 * sciana2;

        int sciana3 = 2;
        int sciana4 = 3;

        int pomieszczenie3 = sciana3 * sciana4;

        int sciana5 = 2;
        int sciana6 = 2;

        int pomieszczenie4 = sciana5 * sciana6;

        System.out.println("Powierzchnia pomieszczenia pierwszego i drugiego wynosi: " + pomieszczenie1 +"m2");
        System.out.println("Powierzchnia pomieszczenia trzeciego wynosi: " + pomieszczenie3+"m2");
        System.out.println("Powierzchnia pomieszczenia czwartego wynosi: " + pomieszczenie4+"m2");
        System.out.println("Powierzchnia calkowita: " + (pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4)+"m2");
    }
}
