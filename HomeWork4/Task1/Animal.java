package HomeWork4.Task1;

public interface Animal {

    String Name = "Animal";

    public void tellMeWhoYouAre();

    default void SetName(String name){}
    default String GetName() {return "";}

}


