package week04_review;

import java.util.Scanner;

import java.lang.String;

public class TestStringObjects {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = new String("Java");

        String str2 = "Java";

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println(str == str2);

        System.out.println(str.equals(str2));

        String s1 = "Batch 28";
        String s2 = "Batch 28";

        System.out.println(s1 == s2);    // will give true because in the string pool created.
        System.out.println(s1.equals(s2));

        String s3 = new Scanner(System.in).nextLine(); // NEW  STRING ("Batch 28")
        System.out.println(s2 == s3); // will give false
        System.out.println(s2.equals(s3));  // will give true


        String a1 = "Wooden Spoon";  // will only create 1 object in the string pool
        String a2 = "Wooden Spoon";
        String a3 = "Wooden Spoon";
        String a4 = "Wooden Spoon";
        String a5 = "Wooden Spoon";

        String b1 = new String("Wooden Spoon");  // will create 5 different object in the java Hip
        String b2 = new String("Wooden Spoon");
        String b3 = new String("Wooden Spoon");
        String b4 = new String("Wooden Spoon");
        String b5 = new String("Wooden Spoon");






    }
}
