package HomeWork4.Task2;

import java.util.Comparator;

public class Cat extends Animal {
    public int Age;
    public String Name;
    public Cat(){
        SetType(TypeAnimal.CAT);
    }
    @Override
    public void tellMeWhoYouAre() {
        System.out.print("Cat " + Name);
    }
    public void SetName(String name){
        Name = name;
    }
    public String GetName() {return Name;}

    @Override
    public void SetAge(int number) {

    }

    public int GetAge() {return Age;}
}
