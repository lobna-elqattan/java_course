package capter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        //initalize known variables

        int rate=15;
        int maxHours=40;


        // get the variables we don't know
        System.out.println("how many hours did u work this week ?");
        Scanner scanner= new Scanner(System.in);
        double hoursWorked= scanner.nextDouble();


        // validate the inputs
        while (hoursWorked>maxHours || hoursWorked < 1){
            System.out.println("invalid input worked hours should be between 40 and 1");
            hoursWorked=scanner.nextDouble();

        }
        scanner.close();

        // calculate gross
        double gross=rate*hoursWorked;
        System.out.println("gross par is :$"+ gross);

    }

}
