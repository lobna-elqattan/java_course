package chapter5;

import java.util.Scanner;

public class CellPhoneBill {

    public static void main(String[] args) {
        //enter data which we know
        double overageMinsPrice=0.25;
        double taxPercentage=0.15;


        Scanner scanner= new Scanner(System.in);


        //get data we don't know
        System.out.println("enter plan Fees :");
        double planFees=scanner.nextDouble();

        System.out.println("enter number of overage mins :");
        int overageMins = scanner.nextInt();

        scanner.close();

        //calculate overage fees cost
        double overageFees= getOverageFees(overageMins,overageMinsPrice);

        //calculate tax
        double tax =getTax(planFees,overageFees,taxPercentage);

        //calculate total
        double total=getTotal(overageFees,planFees,tax);
        // print total price
        System.out.println("total price is "+total);

    }

    public static  double getOverageFees(int overageMins,double overageMinsPrice){
        double overageFees= overageMins*overageMinsPrice;
        return overageFees;
    }

    public static double getTax (double planFees,double overageFeesCost,double taxPercentage ){
        double tax= (overageFeesCost+planFees)*taxPercentage;
        return tax;
    }

    public static double getTotal(double overageFees,double planFees, double tax ){
        double total = overageFees+planFees+tax;
        return total;
    }
}
