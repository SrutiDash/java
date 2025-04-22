//Define two methods to print the maximum and the 
//minimum number respectively among three numbers entered 
//by the user.

import java.util.Scanner;

public class functionQuestion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = input.nextInt();
        int result1 = maximum(num1, num2, num3);
        System.out.println("Largest number is "+result1);
        int result2 = minimun(num1, num2, num3);
        System.out.println("Smallest number is "+result2);
    }

    static int maximum(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            return num1;
        }else if(num2>num1 && num2>num3){
            return num2;
        }else{
            return num3;
        }
    }

    static int minimun(int num1, int num2, int num3){
        if(num1<num2 && num1<num3){
            return num1;
        }else if(num2<num1 && num2<num3){
            return num2;
        }else{
            return num3;
        }
    }
}
