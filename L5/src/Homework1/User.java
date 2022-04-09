package Homework1;

import java.util.stream.Stream;

public class User {
    private String Username;
    private String Name;
    private String Password;
    private String Age;
    private String Address;
    private String Phone_Number;
    private String Education;

    public String getUsername() {
        return Username;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public String getEducation() {
        return Education;
    }

    public User(String username, String name, String password, String age, String address, String phone_Number, String education) {
        Username = username;
        Name = name;
        Password = password;
        Age = age;
        Address = address;
        Phone_Number = phone_Number;
        Education = education;
    }
    public User(){}
}
