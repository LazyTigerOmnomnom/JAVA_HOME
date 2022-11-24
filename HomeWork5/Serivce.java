package HomeWork5;

import HomeWork4.Task1.Cat;
import HomeWork4.Task1.Cow;
import HomeWork4.Task1.Dog;
import HomeWork4.Task1.Snake;

import java.util.ArrayList;
import java.util.Scanner;

public class Serivce {
    private static void cls(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    Scanner sc = new Scanner(System.in);
    private Reposiroty repo = new Reposiroty();


    public void work() {
        MainMenu();

    }

    private void MainMenu(){
        while(true) {
            cls();
            System.out.println("1 - Вывести всех людей и их данные");
            System.out.println("2 - Найти человека по имени, номеру телефона, электронной почте");
            System.out.println("3 - Добавить человека");
            System.out.println("4 - Удалить человека с определенным номером телефона");
            System.out.println("5 - Редактировать данные участника с определенным номером телефона");
            System.out.println("6 - Завершить выполнение");

            System.out.println("Введите нужную цифру из пункт меню: ");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    PrintListRepo();
                    break;
                case 2:
                    FindPerson();
                    break;
                case 3:
                    AddPerson();
                    break;
                case 4:
                    DelPerson();
                    break;
                case 5:
                    EditPerson();
                    break;
                case 6:
                    System.out.println("До свидания! Хорошего дня!");
                    return;
                default:
                    System.out.println("Такой команды нет");
            }
        }
    }


    private void FindPerson(){
        cls();
        System.out.println("1 - по имени");
        System.out.println("2 - по номеру телефона");
        System.out.println("3 - по почте");
        System.out.println("4 - вернуться");
        int number = sc.nextInt();
        Person person = null;
        switch (number){
            case 1:
                System.out.println("Введите имя");
                String name = sc.next();
                ArrayList<Person> persons = repo.findPersons(name);
                if (persons.size() == 0){
                    System.out.println("Записей не найдено");
                }
                else{
                    for (Person p: persons)
                        System.out.println(p.GetInfo());
                }
                break;
            case 2:
                System.out.println("Введите номер телефона");
                String tel = sc.next();
                person = repo.getRecord(tel);
                if (person != null) {
                    System.out.println(person.GetInfo());

                } else {
                    System.out.println("Запись не найдена");
                }
                break;
            case 3:
                System.out.println("Введите номер телефона");
                String mail = sc.next();
                person = repo.findEmailRecord(mail);
                if (person != null) {
                    System.out.println(person.GetInfo());

                } else {
                    System.out.println("Запись не найдена");
                }
                break;
            case 4:
                return;
        }
    }
    private void DelPerson(){
        while(true) {
            cls();
            System.out.println("1 - вернуться");
            System.out.println("2 - ввести номер");
            int number = sc.nextInt();
            switch (number){
                case 1:
                    return;
                case 2:
                    System.out.println("Введите номер телефона");
                    String tel = sc.next();
                    Person person = repo.getRecord(tel);
                    if (person != null) {
                        System.out.println(person.GetInfo());
                        repo.deleteRecord(tel);

                    } else {
                        System.out.println("Запись с таким телефоном не найдена");
                    }
                    break;
            }
        }
    }

    private void AddPerson(){
        cls();
        System.out.println("Введите номер телефона");
        String tel = sc.next();
        Person person = repo.getRecord(tel);
        if (person == null){

            System.out.println("Введите имя");
            String firstName = sc.next();
            System.out.println("Введите фамилию");
            String lastName = sc.next();
            System.out.println("Введите адрес электронной почты");
            String email = sc.next();
            System.out.println("Введите адрес проживания");
            String address = sc.next();
            person = new Person(tel, firstName, lastName, email, address);
            repo.addRecord(person);

            EditPerson(person);

        }
        else{
            System.out.println("Запись с таким телефоном уже существует.");
            EditPerson(person);
        }
    }

    private void EditPerson(){
        System.out.println("Введите номер телефона");
        String tel = sc.next();
        Person person = repo.getRecord(tel);
        if (person != null){
            EditPerson(person);
        }
        else{
            System.out.println("Такого номера нет");
        }
    }
    private void EditPerson(Person person){
        while(true) {
            System.out.println(person.GetInfo());
            System.out.println("Выберите дальнейшие действия:");
            System.out.println("1 - вернуться в главное меню");
            System.out.println("2 - редактировать имеющегося участника");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    return;
                case 2: {
                    System.out.println("Какой параметр редактируем?");
                    System.out.println("1 - номер телефона");
                    System.out.println("2 - имя и фамилию");
                    System.out.println("3 - электронную почту");
                    System.out.println("4 - адрес проживания");
                    number = sc.nextInt();
                    switch (number) {
                        case 1:
                            System.out.println("Введите номер");
                            String tel = sc.next();
                            if (repo.getRecord(tel) == null) {
                                person.setphone(tel);
                            } else {
                                System.out.println("Такой номкр уже существует");
                            }
                            break;
                        case 2:
                            System.out.println("Введите имя");
                            String firstName = sc.next();
                            System.out.println("Введите фамилию");
                            String lastName = sc.next();
                            person.setfirstName(firstName);
                            person.setLastName(lastName);
                            break;
                        case 3:
                            System.out.println("Введите email");
                            String mail = sc.next();
                            person.setemail(mail);
                            break;
                        case 4:
                            System.out.println("Введите адрес");
                            String address = sc.next();
                            person.setaddress(address);
                            break;
                    }
                    break;
                }
                default:
                    System.out.println("Такой команды нет");
            }
        }
    }

    private void PrintListRepo(){
        repo.PrintRepo();
        while(true) {
            cls();
            System.out.println("1 - вернуться в главное меню");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    return;
                default:
                    System.out.println("Такой команды нет");
            }
        }
    }
}

