package HomeWork4.Task2;

import java.util.Comparator;

enum TypeAnimal {COW, CAT, DOG, SNAKE};

public abstract class Animal {

    private String Name = "Animal";
    private Integer Age = 0;
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
    public int compare(Animal o1, Animal o2) {
        return (o1.Type.equals(o2.Type)) ? ((o1.Age.equals(o2.Age)) ? o1.Name.compareTo(o2.Name) : o1.Age.compareTo(o2.Age) ) : o1.Type.compareTo(o2.Type);
    }
}


