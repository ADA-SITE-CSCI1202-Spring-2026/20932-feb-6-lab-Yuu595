import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int multiplication = num1*num2;
        int div = num1 / num2;
        int remainder = num1%num2;

        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + div);
        System.out.println("Remainder = " + remainder);
        

        input.close();
    }
}
