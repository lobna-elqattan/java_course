package capter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {
        // Get required data
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a text to search on ");
        String text=scanner.next();

        System.out.println("enter letter to search for ");
        char requireLetter=scanner.next().charAt(0);
        boolean foundOrNot= false;
        scanner.close();

        // loop to search for certain letter
        for(int i=0;i<text.length();i++){
            char currentLetter=text.charAt(i);
            if (requireLetter== currentLetter)
            {
               foundOrNot=true;

                break;
            }


        }
        if (foundOrNot) {
            System.out.println("letter is found");
        } else{
            System.out.println("letter doesn't exist ");
        }
    }
}
