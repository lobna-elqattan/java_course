package chapter3;
/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {

        // get values u don't have
        System.out.println("please enter your score");
        Scanner scanner= new Scanner(System.in);
        double score= scanner.nextDouble();
        char grade;

        // determine the letter grade

        if (score<60){
            grade='F';
        } else if (score<70) {
            grade='D';
        } else if (score<80) {
            grade='c';

        }else if (score<90) {
            grade='B';

        }else {
            grade='A';

        }

        System.out.println("your grade is "+grade);


    }

}
