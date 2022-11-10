package HomeWork4.Task2;

import HomeWork4.Task1.Animal;

public class Cow implements Animal {
    public String Name;
    @Override
    public void tellMeWhoYouAre() {
        System.out.print("Cow " + Name);
    }
    public void SetName(String name){
        Name = name;
    }
    public String GetName() {return Name;}
}
