import java.util.Scanner;

public class noOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();

        System.out.println("No. of digits in "+num+" is : ");

        int i=0;
        while(num>0){
            int rem = num%10;
            num/=10;
            i++;
        }
        System.out.println(i);
    }
}
