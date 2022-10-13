package HomeWork1.Task7;

public class StringOrchestra {
    Bass bass;
    Guitar guitar;
    Violin violin;
    Cello cello;
    public StringOrchestra (){
        bass = new Bass();
        guitar = new Guitar();
        violin = new Violin();
        cello = new Cello();

    }
    public void playYourParts(){
        bass.playStrings();
        guitar.playStrings();
        violin.playStrings();
        cello.playStrings();

    }
}
