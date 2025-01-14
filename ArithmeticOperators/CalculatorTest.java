import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("enter 1st value");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("enter 2nd value");
        double b = sc.nextDouble();
        Calculator obj=new Calculator();
        double sum=obj.add(a,b);
        System.out.println("sum="+sum);
        double sub=obj.subtract(a,b);
        System.out.println("sub="+sub);
        double multi=obj.multiply(a,b);
        System.out.println("multiply="+multi);
        double div=obj.divide(a,b);
        System.out.println("division="+div);
    }
}