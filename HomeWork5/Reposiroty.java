package HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;

public class Reposiroty {
    private HashMap<String, Person> phoneBook = new HashMap<>();
    public Reposiroty() {}

    public void addRecord(String phone, String firstName,String lastName, String email, String address){ //добавление записи
        phoneBook.put(phone, new Person(phone, firstName, lastName, email, address));
    }

    public void addRecord(Person person){
        phoneBook.put(person.getphone(), person);
    }

    public Person getRecord(String phone) { //поиск по номеру телефона
        return phoneBook.get(phone);
    }

    public Person findEmailRecord(String email) { //поиск по email
        for (Person person : phoneBook.values()) {
            if (person.getemail().equals(email)) {
                return person;
            }
        }
        return null;
    }

    public ArrayList<Person> findPersons(String name) { //поиск по имени и фамилии
        ArrayList<Person> list = new ArrayList<>();
        for (HashMap.Entry<String, Person> entry : phoneBook.entrySet()) {
            Person person = entry.getValue();
            if (person.getfirstName().contains(name) || person.getLastName().contains(name)) {
                list.add(person);
            }
        }
        return list;
    }
    public void deleteRecord(String phone) { //удаление по номеру телефона
        phoneBook.remove(phone);
    }

    public void PrintRepo(){
        for (Person person : phoneBook.values()){
            System.out.println(person.GetInfo());
        }
    }
}
