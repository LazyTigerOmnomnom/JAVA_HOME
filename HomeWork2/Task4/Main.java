package HomeWork2.Task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static ArrayList <String> not_anagram = new ArrayList<String>();
    private static ArrayList <String> anagram  = new ArrayList<String>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        for (int i = 0; i < number; i++){
            not_anagram.add(sc.next());
        }
        boolean flag = true;
        while(flag){
            flag = false;
            for (int i = 0; i < not_anagram.size() - 1; i++) {
                for (int j = i + 1; j < not_anagram.size(); j++) {
                    if (isAnagram(not_anagram.get(i), not_anagram.get(j))){
                        flag = true;
                        anagram.add(not_anagram.remove(j));
                        anagram.add(not_anagram.remove(i));

                        break;
                    }
                }
                if (flag) break;
            }
        }
        System.out.println("Анаграммы:");
        System.out.println(convertStringArrayToString(anagram, " "));
        System.out.println("Не анаграммы:");
        System.out.println(convertStringArrayToString(not_anagram, " "));
    }

    private static String convertStringArrayToString(ArrayList<String> strArr, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr)
            sb.append(str).append(delimiter);
        return sb.substring(0, sb.length() - 1);
    }

    public static boolean isAnagram(String s1 , String s2)
    {
        s2=new StringBuilder(s2.toLowerCase().replace("ь", "")).reverse().toString();

        s1 = s1.toLowerCase().replace("ь", "");
        return s1.equals(s2);
    }

}
