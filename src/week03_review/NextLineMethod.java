package week03_review;

import java.util.Scanner;

public class NextLineMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");

        String fullName = input.nextLine();

        System.out.println("fullName = " + fullName);

        System.out.println("Enter you age: ");

        int age = input.nextInt();

        System.out.println("age = " + age);

        input.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("schoolName = " + schoolName);




    }

}
