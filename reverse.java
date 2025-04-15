import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

        int originalNum = num;
        int i=0;
        System.out.println("Reverse of "+num+" is ");
        while(num>0){
            int rem=num%10;
            num/=10;
            i++;
            System.out.print(rem);
        }
    }
}
