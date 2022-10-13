package HomeWork1.Task7;

public class Main {
    public static void main(String[] args){
        KeysOrchestra keysOrchestra = new KeysOrchestra();
        StringOrchestra stringOrchestra = new StringOrchestra();

        System.out.println("Сейчас играют клавишные: ");
        keysOrchestra.playYourParts();
        System.out.println("Сейчас играют струнные: ");
        stringOrchestra.playYourParts();
    }
}
