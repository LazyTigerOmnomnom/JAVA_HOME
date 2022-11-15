package HomeWork4.Task2;

public class Dog extends Animal {
    public int Age;
    public String Name;
    public Dog(){
        SetType(TypeAnimal.DOG);
    }
    @Override
    public void tellMeWhoYouAre() {
        System.out.print("Dog " + Name);
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
