import java.util.Scanner;

public class swapFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int number1 = input.nextInt();
        System.out.println("Enter your second number : ");
        int number2 = input.nextInt();
        int[] swapped = swap(number1, number2);
        System.out.println("Swapping : "+swapped[0] +" "+swapped[1]);
    }

    //we need to use wrapper class as un a function we cant return more than two values

    static int[] swap(int num1, int num2){
        int temp = num1;
        num1=num2;
        num2=temp;
        return new int[]{num1, num2};
    }
}
