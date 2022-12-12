package week05_review;

public class MethodPractice_Return {

    public static void main(String[] args) {


        double a = calculate(10,'*', 22.2);
        System.out.println(a);

        System.out.println("-------------------------------------");

        double multiplication = calculate(10, '*', 20);
        System.out.println(multiplication);

        System.out.println("-------------------------------------");

        System.out.println(calculate(10, '^', 20));


    }


    public static double calculate(double num1, char mathOperator, double num2) {
        double result = 0;
        switch (mathOperator) {

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
            default:
                System.err.println("Invalid Math Operator");
        }

        return result;
    }


}
