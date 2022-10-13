package HomeWork1.Task7;

public class KeysOrchestra {
    Piano piano;
    Organ organ;
    Harpsichord harpsichord;

    public KeysOrchestra(){
        piano = new Piano();
        organ = new Organ();
        harpsichord = new Harpsichord();
    }
    public void playYourParts(){
        piano.playKeys();
        organ.playKeys();
        harpsichord.playKeys();
    }

}
