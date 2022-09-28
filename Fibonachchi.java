import java.util.Scanner;

public class Fibonachchi {
    private static int n;

    private static int fibonachchi(int n){
        if (n == 1 || n == 2)
            return 1;
        return fibonachchi(n - 1) + fibonachchi(n - 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        n = Integer.parseInt(sc.next());
        System.out.println(fibonachchi(n));
    }
}
