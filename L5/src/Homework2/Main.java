package Homework2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        Form.getInstance().name = sc.nextLine();
        Form.getInstance().show();
    }
}
