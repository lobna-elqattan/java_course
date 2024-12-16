package capter4;

import java.util.Scanner;

public class Cashier {
    
        public static void main(String[] args) {
            // get unknown variables
            System.out.println("how many items do u want to enter ?");
            Scanner scanner= new Scanner(System.in);
            int numberOfItems= scanner.nextInt();
            double total=0;


            // create a loop to iterate through items and sum their costs
            for (int i=0;i<numberOfItems;i++){
                System.out.println("enter the price of the item ");
                double price= scanner.nextDouble();
                total=total+price;

            }

            //print the total price
            scanner.close();
            System.out.println("the total price is :$"+ total);

        }
    }

