package week04_review;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String str = "Cydeo";

        char ch = str.charAt(1);

       int length = str. length();
        System.out.println(ch);
        System.out.println(length);

        int lastIndex = str.length() -1;
      char ch2 = str. charAt((lastIndex));
        System.out.println(ch2);


        System.out.println("-------------------------------------------");

        String s1 = "Batch 28";

        String upperCase = s1.toUpperCase();
        String lowerCase = s1.toLowerCase();
        System.out.println(upperCase);
        System.out.println(lowerCase);

        s1 = s1.toUpperCase();

        System.out.println("-------------------------------------------");


        String s2 = "I live in Virginia";

        s2 = s2.replace("Virginia", "New York");

        System.out.println(s2);
        System.out.println("-------------------------------------------");

        String s3 = "Batch 28 students";

        String t1 = s3.substring(0,8);
        System.out.println(t1);

        String t2 = s3.substring(s3.indexOf('s'));

        System.out.println(t2);

        System.out.println("-------------------------------------------");

        String name = "mUhTar";

       // name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        name = (""+name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);

        System.out.println("-------------------------------------------");


        String a = "yEs";

        System.out.println(a.equalsIgnoreCase("yes"));

        System.out.println("-------------------------------------------");

        String l = "Today we will have java";
        boolean hasSelenium = l.contains("Selenium");

        System.out.println(hasSelenium);













    }


}
