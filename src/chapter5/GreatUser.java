package chapter5;

import java.util.Scanner;

public class GreatUser {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your name ");
        String name = scanner.next();
        greatUser(name);

    }
    public static void greatUser( String name){
        System.out.println("hello "+name );

    }

}
