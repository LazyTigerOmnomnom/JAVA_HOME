package HomeWork4.Task2;

enum TypeAnimal {COW, CAT, DOG, SNAKE};

public abstract class Animal {

    private String Name = "Animal";
    private int Age = 0;
    private TypeAnimal Type;

    abstract void tellMeWhoYouAre();
    public void SetAge(int age){Age = age;}
    public int GetAge(){return Age;}
    public void SetType(TypeAnimal type){Type = type;}
    public TypeAnimal GetType(){return Type;}
    void SetName(String name){Name = name;}
    String GetName() {return "";}
    void tellMeHowAreYou() {

    }
}


