package chapter3;

import java.util.Scanner;

public class PayCalculator {
    public static void main(String[] args) {
        // enter Known data
        int salary =1000;
        int bonus =250;

        //collect required data
        System.out.println("please enter employee sales made");
        Scanner scanner=new Scanner(System.in);
        int numberOfSales=scanner.nextInt();
        scanner.close();

        //calculate payment
        if(numberOfSales>10){
            salary=salary+bonus;
        }

        //print payment
        System.out.println("employee salary is $"+salary);


    }
}
