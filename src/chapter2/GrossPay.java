package chapter2;

import java.util.Scanner;

public class GrossPay {
    public static void main(String[] args) {
        //asking for number of hours
        System.out.println("enter the number of hours the employee worked");
        Scanner scanner =new Scanner(System.in);
       int hours= scanner.nextInt();

        // asking user for employee pay rate
        System.out.println("enter employee  pay rate");
      double rate=  scanner.nextDouble();
        scanner.close();
        //calculating employee payment
        double grossRate= rate*hours;
        //display result
        System.out.println("the employee gross rate is $"+grossRate);
        







    }
}

