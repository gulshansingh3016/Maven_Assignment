import java.util.Scanner;
public class  Application {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        System.out.println("Enter two numbers");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        Calculator cal = new Calculator();
        cal.addition(num1, num2);
        cal.subtraction(num1, num2);
        cal.division(num1, num2);
        cal.multiply(num1, num2);
    }
}
