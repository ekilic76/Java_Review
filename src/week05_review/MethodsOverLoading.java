package week05_review;

public class MethodsOverLoading {

    public static void main(String[] args) {

        String result = contact("java", "school");
        System.out.println(result);
        String result1 = contact("Java", "Programming", "language");
        System.out.println(result1);



    }

    public static String contact(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static String contact(String str1, String str2, String str3) {
        return str1 + " " + str2 + " " +" "+ str3;
    }

    public static String contact(String str1, String str2, String str3, String str4) {
        return str1 + " " + str2 + " " + str3 + " " + str4;
    }
}
