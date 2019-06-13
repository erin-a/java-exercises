package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = myObj.nextLine();
        System.out.println("Hello, World " + userName);
    }

}
