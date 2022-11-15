package HomeWork4.Task2;

import java.util.*;
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

            System.out.println("Введите Возраст животного: ");
            int number = sc.nextInt();
            animal.SetAge(number);
            Animals.add(animal);
        }

        Animals.sort((x1, x2) -> x1.compare(x1, x2) );
        for(Animal ani : Animals) {
            ani.tellMeWhoYouAre();
            System.out.println();
        }

    }


}
