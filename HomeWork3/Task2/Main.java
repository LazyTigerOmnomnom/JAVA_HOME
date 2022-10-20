package HomeWork3.Task2;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = Integer.parseInt(a);
        String c = reader.readLine();
        int d = Integer.parseInt(c);
        String h = reader.readLine();
        int t = Integer.parseInt(h);
        triangle(b, d, t);

    }

    public static void triangle(int m, int n, int u) {
        if (m + n >= u) {
            if (n + u >= m)
                if (m + u >= n)
                    System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треуголник не существует");
        }
    }
}

