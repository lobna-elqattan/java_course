package chapter3;

import java.awt.*;
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("please enter your Grade");
        Scanner scanner = new Scanner(System.in);
        String grade= scanner.next();
        scanner.close();

        String message;
        switch (grade){

            case "A":
                message=("excellent");
                break;

            case "B":
                message=("great job");
                break;
            case "C":
                message=("good job");
                break;
            case "D":

                message=("need to study harder");
                break;
            case "F":
                message=("u should be ashamed");
                break;
            default:
                message=("invalid grade");
                break;


        }

        System.out.println(message);
    }
}
