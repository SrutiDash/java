import java.util.Scanner;

public class practiceLoop1 {
    public static void main(String[] args) {
        // Take an integer N as input and print all numbers from 1 to N using a loop.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        System.out.println("Numbers from 1 to "+num+" are : ");
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }

        //Print all even numbers from 1 to N.
        System.out.println("Even numbers from 1 to "+num+" are : ");
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        //Take an input N and print the sum of numbers from 1 to N.
        System.out.println("Sum of natural numbers from 1 to "+num+" are :");
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);

        //Take input N and print its multiplication table up to 10.
        System.out.println("Multiplication table of "+num+" is :");
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+ num*i);
        }
    }
}
