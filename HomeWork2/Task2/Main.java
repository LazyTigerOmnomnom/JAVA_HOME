package HomeWork2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean flag = true;
        while (flag) {
            if (i == 0)
                System.out.println("Что бы поделать? ");
            else
                System.out.println("Что бы еще поделать? ");
            String text = sc.nextLine();
            if (text.contains("Ничего не делай"))
                flag = false;
            i++;
        }
        System.out.println("Пойду бездельничать");
    }
}