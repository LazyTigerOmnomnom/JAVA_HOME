package HomeWork3.Task1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static int n;
    static HashMap<Integer, Integer> nums = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые будете считывать: ");
        n = Integer.parseInt(sc.next());
        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(sc.next());
            nums.put(num, nums.getOrDefault(num, 0) + 1);
         }
        System.out.println("Выводимый результат:");
        for (HashMap.Entry<Integer, Integer> entry : nums.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(convertStringArrayToString(entry.getKey(), entry.getValue()));
            }
        }
        System.out.print("Уникальные числа: " );
        for (HashMap.Entry<Integer, Integer> entry : nums.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey().toString() + " ");
            }
        }
    }
    private static String convertStringArrayToString(Integer num, Integer count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
            sb.append(num).append(" ");
        return sb.substring(0, sb.length() - 1);
    }

}
