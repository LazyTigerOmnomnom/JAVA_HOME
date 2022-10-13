package HomeWork1.Task1;

import java.util.Scanner;

public class Vklad {
    private static float start_summa;
    private static float summa;
    private static int kol_let;
    private static float procent;
    private static float dohod;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        start_summa = Float.parseFloat(sc.next());
        summa = start_summa;
        System.out.println("Введите срок вклада: ");
        kol_let = Integer.parseInt(sc.next());
        System.out.println("Введите процент по вкладу: ");
        procent = Float.parseFloat(sc.next());
        for (int god = 0; god < kol_let; god++) {
            for (int mes = 0; mes < 12; mes++) {
                float x = ((summa * procent) / 100) / 12;
                summa += x;
                dohod = summa - start_summa;
                System.out.println("доход на конец месяца " + dohod);
            }
            if (dohod > 42500) {
                float x = (dohod - 42500) * 0.13f;
                System.out.println("налог " + x);
                summa -= x;
            }
        }
        System.out.println("сумма " + summa);
        System.out.println("доход " + (summa - start_summa));
    }




}
