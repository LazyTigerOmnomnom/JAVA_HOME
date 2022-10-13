package HomeWork2.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            exceptional();
        }
        catch (Exception ex){
            System.out.println("Ха-ха! Попался! я поймал исключение");
        }
        finally {
            System.out.println("До свидания");
        }
    }
    public static void exceptional() throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true){
            if (i == 0)
                System.out.println("Введите строку: ");
            else
                System.out.println("Давай попробуем снова: ");
            String text = sc.nextLine();
            text = text.toLowerCase();
            if (text.contains("отстань от меня, пожалуйста"))
                throw new Exception();
            i++;
        }

    }
}
