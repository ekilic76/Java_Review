package week03_review;

public class FINRA {
    public static void main(String[] args) {

        int number = 25;


        // FIN, RA, FINRA, number
        String result = "";


        if (number % 3 == 0 && number % 5 == 0) {
            //  false && true ==> false
            result = "FINRA";
        } else if (number % 3 == 0) {
            result = "FIN";
        } else if (number % 5 == 0) {
            result = "RA";
        } else {
            result = ""+number; //"17"
        }


        System.out.println(result);


    }
}
