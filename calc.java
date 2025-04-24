//to make a simple calculator app where unless and until the user presses x or X it wont break
// or else it will keep taking user input

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int ans = 0;
        while(true){
            System.out.println("Enter an operator (+, -, *, /, %) or x to exit:");
            char operator = input.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.println("Enter first number : ");
                num1 = input.nextInt();
                System.out.println("Enter second number : ");
                num2 = input.nextInt();

                if(operator == '+'){
                    ans = num1+num2;
                }else if(operator == '-'){
                    ans = num1-num2;
                }else if(operator == '*'){
                    ans = num1*num2;
                }else if(operator == '/'){
                    if(num2!=0){
                        ans = num1/num2;
                    }else{
                        System.out.println("Enter a non zero value in your second number");
                        continue;
                    }
                }else if(operator == '%'){
                    if(num2!=0){
                        ans = num1%num2;
                    }else{
                        System.out.println("Enter a non zero value in your second number");
                        continue;
                    }
                }
                System.out.println("Your result is "+ans);
            }
            if(operator == 'x' || operator == 'X'){
                break;
            }
        }
    }
}
