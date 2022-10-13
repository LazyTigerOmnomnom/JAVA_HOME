package HomeWork2.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Integer> numbers  = new ArrayList<>(); //список последовательности
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.next()); // Число строк
        int cols = Integer.parseInt(sc.next()); // число столбцов
        for(int i = 0; i < rows * cols; i++) // подсчет количество чисел, которые надо ввести
        {
            int x = Integer.parseInt(sc.next()); // ввод чисел
            numbers.add(x);
        }
        Collections.sort(numbers); // сортируем
        Collections.reverse(numbers); // зеркалим
        int cur = 0;
        for (int num: numbers) {
            System.out.print(num + " "); //выводим через пробел
            cur++;
            if (cur == cols)
                System.out.println(); //переход на новую строку
        }

        }
    }

