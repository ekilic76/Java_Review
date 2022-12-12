package week03_review;

public class IfStatements1 {
    public static void main(String[] args) {

        // odd or even

        int num = 100;

       /*
       if (num % 2 != 0){
            System.out.println("Odd number");
        }
        if (num % 2 == 0){
            System.out.println("Even Number");
        }

        */

        if (num % 2 != 0){
            System.out.println("Odd number");
        } else{
            System.out.println("Even Number");
        }

        System.out.println("------------------------------------");

        // 28 days 30 days 31 days

        int month = 3;
        if (month >= 1 && month<= 12){
            if (month == 28){
                System.out.println("28 Days.");
            }else if (month == 4 || month == 6 || month ==9 || month ==10) {
                System.out.println("30 Days.");
            }else{
                System.out.println("31 Days.");
            }

        }else{
            System.out.println("Invalid");
        }




    }
}
