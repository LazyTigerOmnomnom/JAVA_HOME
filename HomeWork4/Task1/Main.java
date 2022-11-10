package HomeWork4.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static ArrayList<Animal> Animals = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите тип животного: ");
            String text = sc.next();
            if (text.equals("Достаточно")) break;
            Animal animal;
            switch (text){
                case "Cow":
                    animal = new Cow();
                    break;
                case "Cat":
                    animal = new Cat();
                    break;
                case "Dog":
                    animal = new Dog();
                    break;
                case "Snake":
                    animal = new Snake();
                    break;
                default: animal = null;
            }
            System.out.println("Введите имя животного: ");
            text = sc.next();
            animal.SetName(text);
            Animals.add(animal);
        }

        
        Map<String, List<Animal>> gr_animals = Animals.stream().collect(Collectors.groupingBy(Animal::GetName));
        for (Map.Entry<String, List<Animal>> entry : gr_animals.entrySet()) {
            for(Animal ani : entry.getValue()) {
                ani.tellMeWhoYouAre();
                System.out.print(", ");
            }
            System.out.println();
        }
    }


}
