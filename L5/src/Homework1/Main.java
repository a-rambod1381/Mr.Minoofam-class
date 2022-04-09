package Homework1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Username;
        String Name;
        String Password;
        String Age;
        String Address;
        String Phone_Number;
        String Education;


        System.out.println("Enter your username:");
        Username = sc.nextLine();
        System.out.println("Enter you Name:");
        Name = sc.nextLine();
        System.out.println("Enter Password:");
        Password = sc.nextLine();
        System.out.println("Enter your Age:");
        Age = sc.nextLine();
        System.out.println("Enter your Address:");
        Address = sc.nextLine();
        System.out.println("Enter your phone number:");
        Phone_Number = sc.nextLine();
        System.out.println("Enter your Education:");
        Education = sc.nextLine();

        User user = new UserBuilder().setUsername(Username).setName(Name).setPassword(Password).setAge(Age).setAddress(Address).setPhone_Number(Phone_Number).setEducation(Education).createUser();
        System.out.println(user.getUsername());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
        System.out.println(user.getAddress());
        System.out.println(user.getPhone_Number());
        System.out.println(user.getEducation());

    }
}
