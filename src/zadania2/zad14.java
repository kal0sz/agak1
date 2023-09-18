package zadania2;

import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wybierz litere reprezentującą wybrany przez siebie pakiet:");
        String pakiet = klawiatura.nextLine();

        System.out.println("Podaj liczbę minut rozmów:");
        int minuty = klawiatura.nextInt();

            if (pakiet.equals("a") && minuty <= 450) {
                System.out.println("Łączna opłata za ten miesiąc wynosi: 39,99zł ");
            } else if (pakiet.equals("a") && minuty > 450 && minuty <= 494) {
                double oplata = (39.99 + ((minuty - 450) * 0.45));
                System.out.println(" Łączna opłata za ten miesiąc wynosi: " + oplata + "zł");
            }else if(pakiet.equals("a") && minuty > 494 && minuty<=925) {
                double oplata = (39.99 + ((minuty - 450) * 0.45));
                double betterb = 59.99;
                double oszcz = (oplata - 59.99);
                System.out.println(" Łączna opłata za ten miesiąc wynosi: " + oplata + "zł. Wybierając pakiet b oszczędziłbyś: " + oszcz + "zł");
            }else if(pakiet.equals("a") && minuty > 925){
                double oplata =  (39.99 + ((minuty - 450) * 0.45));
                double oszcz = (oplata - 69.99);
                System.out.println(" Łączna opłata za ten miesiąc wynosi: " + oplata + "zł. Wybierając pakiet c oszczędziłbyś: " + oszcz + "zł");



            } else if (pakiet.equals("b") && minuty <= 900) {
                System.out.println("Łączna opłata za ten miesiąc wynosi: 59,99zł ");
            } else if (pakiet.equals("b") && minuty > 900 && minuty <= 925) {
                    double oplata = (59.99 + ((minuty - 900) * 0.40));
                    System.out.println(" Łączna opłata za ten miesiąc wynosi: " + oplata + "zł");
            }else if(pakiet.equals("b") && minuty > 925) {
                    double oplata = (59.99 + ((minuty - 900) * 0.40));
                    double oszcz = (oplata - 69.99);
                    System.out.println(" Łączna opłata za ten miesiąc wynosi: " + oplata + "zł. Wybierając pakiet c oszczędziłbyś: " + oszcz + "zł");



            }else if (pakiet.equals("c")) {
                System.out.println("Łączna opłata za ten miesiąc wynosi: 69,99zł ");
            }
        }
    }
