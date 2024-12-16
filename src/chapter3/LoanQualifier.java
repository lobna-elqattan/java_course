package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] args) {
        // initialize values we know
        int requiredSalery =  30000;
        int requiredYears=2;

        // get values we don't know
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your salary");
        double salary = scanner.nextDouble();
        System.out.println("please enter your years of experience");
        double years = scanner.nextDouble();

        // make a decision

        if (salary>=requiredSalery){
            if (years>=requiredYears)
            {
                System.out.println(" you can get the loan");

            }
            else {
                System.out.println("years of experience must be more than "+ requiredYears+"years");
            }

        }
        else{
            System.out.println("salary must be more than"+requiredSalery+"$");

        }

    }
}
