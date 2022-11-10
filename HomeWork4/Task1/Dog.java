package HomeWork4.Task1;

public class Dog implements Animal {
    public String Name;
    @Override
    public void tellMeWhoYouAre() {
        System.out.print("Dog " + Name);
    }
    public void SetName(String name){
        Name = name;
    }
    public String GetName() {return Name;}
}
