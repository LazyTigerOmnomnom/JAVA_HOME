package HomeWork4.Task2;

public class Snake extends Animal {
    public int Age;
    public String Name;
    public Snake(){
        SetType(TypeAnimal.SNAKE);
    }
    @Override
    public void tellMeWhoYouAre() {
        System.out.print("Snake " + Name);
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
