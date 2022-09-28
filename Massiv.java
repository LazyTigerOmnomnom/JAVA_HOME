import java.util.ArrayList;
import java.util.Scanner;

public class Massiv {
    private static int n;



    private static ArrayList<Integer> numbers  = new ArrayList<Integer>(); //список последовательности
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
       n = Integer.parseInt(sc.next());
        for(int i = 0; i<n; i++)
        {
        System.out.println("Введите следующее число: ");
        int x = Integer.parseInt(sc.next());
            numbers.add(x);
        }
        for(int i = 0; i<n; i++) {
            int a=0; //предыдущее число
            int a1=numbers.get(i); //текущее число
            int a2=0; //следующее число
            if (i>0){
                a = numbers.get(i-1); //условие, если есть предыдущее число
            }
            if (i<n-1) {
                a2 = numbers.get(i + 1); //если есть следующее число
            }
            System.out.print((a+a1+a2) + " "); //считаем их сумму и выводим на консоль
        }
    }
}
