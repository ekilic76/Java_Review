package week06_review;

import java.util.Scanner;

public class EnterEvenNumber_WhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a even number: ");
        int num = input.nextInt();

        while (num % 2 != 0){
            System.out.println(num + " is not a even number, please re-enter");
            num = input.nextInt();
        }

        System.out.println("Even number: " +num);



    }



}
/*
Write the program that asks user to enter even number UNTIL user enters a valid input
 */