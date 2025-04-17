import java.util.Scanner;

public class function3 {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("Your result is "+ans);
    }

    //when we're returning something we need not need to use void
    
    static int sum(){
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        num1 = input.nextInt();
        System.out.println("Enter the second number : ");
        num2 = input.nextInt();
        sum = num1+num2;
        return sum;
        //we are using the return type of the function as int
        //because as we are returning sum which is of type int 
    }

}
