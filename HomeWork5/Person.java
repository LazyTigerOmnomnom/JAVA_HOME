package HomeWork5;

public class Person {
    private String phone;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public Person(String phone,
                  String firstName,
                  String lastName,
                  String email,
                  String address) {
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public String GetInfo(){
        return String.format("Фамилия и имя: %s %s номер телефона: %s, Адреса электронной почты: %s, Адрес проживания: %s", lastName, firstName, phone, email, address);
    }



    public String getphone() {
        return phone;
    }
    public String getfirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getemail() {
        return email;
    }
    public String getaddress() {
        return address;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setemail(String email) {
        this.email = email;
    }
    public void setaddress(String address) {
        this.address = address;
    }
}


