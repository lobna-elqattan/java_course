package capter4;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean again;
        do{
            System.out.println("enter the first number");
            int num1= scanner.nextInt();

            System.out.println("enter the second number");
            int num2= scanner.nextInt();

            int sum =num1+num2;
            System.out.println("the sum is :"+sum);

            System.out.println("do u want to repeat ");
            again=scanner.nextBoolean();


        }
        while (again);
        scanner.close();

    }
}
