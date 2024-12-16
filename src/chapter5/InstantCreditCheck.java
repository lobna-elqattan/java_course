package chapter5;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */


import java.util.Scanner;

public class InstantCreditCheck {
    // enter the known data
    static int requiredSalary=25000;
    static int requiredCresitScrore=700;

    static  Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

      double salary= getUserSalary();
      int creditScore= getUserCredit();
        scanner.close();
      boolean qualified=isUserQualified(salary,creditScore);
         notifyUser(qualified);

    }
    public static double getUserSalary(){
        System.out.println("enter your salary");
        double salary=scanner.nextDouble();
        return salary;
    }
    public static int getUserCredit(){
        System.out.println("enter your credit score ");
        int creditScore=scanner.nextInt();
        return creditScore;

    }
    public static boolean isUserQualified(double salary,int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCresitScrore) {
            return (true);

        }
        else {
            return (false);
        }
    }
    public static void notifyUser(boolean qualified){
        if(qualified){
            System.out.println("you are qualified");
        }else {
            System.out.println("u are rejected ");
        }

    }

}
