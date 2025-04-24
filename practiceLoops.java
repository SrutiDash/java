import java.util.Scanner;

public class practiceLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //write a program to print number from 1 to n
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        System.out.println("First "+num+" natural numbers are : ");
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
        
        //write a program to print sum of first n numbers :
        System.out.println("Sum of first "+ num+" natural numbers are : ");
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);

        //write a program to print factorial of n :
        System.out.println("Factorial of "+num+" : ");
        int fact=1;
        for(int i=1;i<=num;i++){
           fact*=i;
        }
        System.out.println(fact);

        //write a program to print factorial of first n numbers :
        System.out.println("Factorial of 1 to "+ num+ " : ");
        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial*=i;
            System.out.println("Factorial of "+i+" is "+factorial);
        }
    }
}
