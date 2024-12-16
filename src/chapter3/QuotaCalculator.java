package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        /*
         * IF ELSE
         * All salespeople are expected to make at least 10 sales each week.
         * For those who do, they receive a congratulatory message.
         * For those who don't, they are informed of how many sales they were short.
         */


        //initialize values we know
        int quota = 10;

        // get values we don't know
        System.out.println("enter the number of sales made this week ");
        Scanner scanner= new Scanner(System.in);
        int sales= scanner.nextInt();
        scanner.close();

        //male a decision - output
        if(sales>=quota)
            System.out.println("congrates u met the require quota");
        else {
            int salesShort= quota-sales;
            System.out.println("u didn't meet required quota u are short by "+salesShort +" sales short ");
        }


    }
}
