//A person is eligible to vote if his/her age is greater than 
//or equal to 18. Define a method to find out if he/she is 
//eligible to vote.

import java.util.Scanner;

public class functionQuestion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        String answer = vote(age);
        System.out.println(answer);
    }

    static String vote(int age){
        if(age>=18){
            return "You can vote";
        }else{
            return "You cannot vote";
        }
    }
}
