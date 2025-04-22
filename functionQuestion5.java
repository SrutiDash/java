//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class functionQuestion5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        int answer = sum(num1, num2);
        System.out.println("Product of "+num1+" and "+num2+" is "+answer);
    }
    
    static int sum(int num1, int num2){
        int sum = num1*num2;
        return sum;
    }
}
