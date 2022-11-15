package HomeWork4.Task2;

public class Cow extends Animal {
    public int Age;
    public String Name;
    public Cow(){
        SetType(TypeAnimal.COW);
    }
    @Override
    public void tellMeWhoYouAre() {
        System.out.print("Cow " + Name);
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
