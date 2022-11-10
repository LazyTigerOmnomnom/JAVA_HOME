package HomeWork4.Task1;

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
