//Write a program to Add Two Number Using Input 
import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();
        int result = num1 + num2;
        System.out.println("The Result is : " + result);
    }
}
