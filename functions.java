//function is a block of code
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        //when you call a fuction you use brackets
        sum();
    }   

    static void sum(){
        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number :");
        num1 = input.nextInt();
        System.out.println("Enter your second number :");
        num2 = input.nextInt();
        sum = num1+num1;
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
    }
}


// synrax for function

       // psvm{
       //     call the function
       // }

        // return_type name(){
        //     body
        //     return statememt
        // }