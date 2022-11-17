import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        float num1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float num2 = sc.nextFloat();
        float result = num1 + num2;
        System.out.println("The Addition of "+num1 +" & "+ num2 +" is : " + result);
        result = num1 - num2;
        System.out.println("The Subtraction of "+num1 +" & "+ num2 +" is : " + result);
        result = num1 * num2;
        System.out.println("The Multiplication of "+num1 +" &"+ num2 +" is : " + result);
        result = num1 / num2;
        System.out.println("The Division of "+num1 +" & "+ num2 +" is : " + result);
        result = num1 % num2;
        System.out.println("The Modulus of "+num1 +" & "+ num2 +" is : " + result);
        
    }
}
