package HomeWork4.Task2;

import HomeWork4.Task1.Animal;

public class Snake implements Animal {
    public String Name;
    @Override
    public void tellMeWhoYouAre() {
        System.out.print("Snake " + Name);
    }
    public void SetName(String name){
        Name = name;
    }
    public String GetName() {return Name;}
}
