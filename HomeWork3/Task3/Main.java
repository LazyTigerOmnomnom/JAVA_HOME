package HomeWork3.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        for(int i = num; i <= num2; i++){
            if (i % num3 == 0){\
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }

}
