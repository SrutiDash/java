//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class functionQuestion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        String answer = oddOrEven(num);
        System.out.println(num+" is even? : "+ answer);
    }

    static String oddOrEven(int num){
        if(num==0){
            return "neither odd nor even";
        }else if(num%2==0){
            return "true";
        }else{
            return "false";
        }
    }
}
