package week06_review;

public class TestObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();
        student1.setInfo("Josh",25, 'M', true, false, 28, "java","Encapsulation");

        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("Emily", 24,'F',true, true, 24,"python", "Inheritance");

        CydeoStudent student3 = new CydeoStudent( );
        student3.setInfo("Daniel", 45, 'M', true, false,26, "Javascript", "Domain");

        student1.name = "Sajjad"; // rename the student1

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


        student1.study();

        CydeoStudent student4 = new CydeoStudent();

        System.out.println(student4);
        







    }



}
