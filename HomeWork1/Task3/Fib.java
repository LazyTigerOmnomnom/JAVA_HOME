package HomeWork1.Task3;
import java.util.ArrayList;
import java.util.Scanner;

public class Fib {
    private static int n;

    private static void fib(int n){
        int i = 0; //счетчик
        int fib1 = 1; //первое число
        int fib2 = 1; // второе число
        int fib_sum = 1; //следующее число
        numbers.add(1); //список намберс с начальным значением
        while (i < n - 2) { //цикл до необходимого нам числа -2, так как первые два значения заданы
            fib_sum = fib1 + fib2; //расчет следующего числа
            numbers.add(fib_sum); // добавляем в список найденное число
            fib1 = fib2; //заменяем переменные
            fib2 = fib_sum;
            i = i + 1; //увеличиваем количество чисел последовательности которое мы нашли
        }
    }
        private static ArrayList <Integer> numbers  = new ArrayList<Integer>(); //список последовательности
    private static ArrayList <Integer> in_numbers  = new ArrayList<Integer>(); //относятся к последовтаельности
    private static ArrayList <Integer> not_in_numbers  = new ArrayList<Integer>(); // не относятся к последовательности
    public static void main(String[] args){
        fib(40); //для большего не хватает памяти
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        n = Integer.parseInt(sc.next());
        for(int i = 0; i<n; i++){
            System.out.println("Введите следующее число: ");
            int x = Integer.parseInt(sc.next());
            if (numbers.contains(x)){ //определяем находится ли в списке последовательности введенное число пользователем или нет
                in_numbers.add(x);
            }
            else{
                not_in_numbers.add(x);
            }
        }
        System.out.println("Это числа фибоначчи:"); //вывод списков
        for (int num: in_numbers) {
            System.out.println(num);
        }
        System.out.println("Это не числа фибоначчи:"); //вывод списков
        for (int num: not_in_numbers) {
            System.out.println(num);
        }
    }
}
