package week03_review;

import java.util.Scanner;

public class ScannerPractice {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");

        int num = input.nextInt();

        System.out.println("You have entered: " + num);

        System.out.println("Please enter an decimal number: ");

        double num1 = input.nextDouble();

        System.out.println("You have entered: " + num1);
        System.out.println("Are you employed?");

        String employed = input.next();
        System.out.println("employed = " + employed);


        input.close();


    }
}
