import java.util.Scanner;

public class countNums{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number of 5 digits");
        int num = input.nextInt();
        System.out.println("Which number you want to check repeating again and again :");
        int repeat = input.nextInt();

        int originalNum = num;
        int count = 0;
        while(num>0){
            int rem=num%10;
            if(rem==repeat){
                count++;
            }
            num/=10;
        }

        System.out.println("Number of repeatations of "+repeat+" in "+originalNum+" is "+count);
    }
}