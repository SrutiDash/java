//fibonacci number

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();

//0,1,1,2,3,5,8,13......

        int a = 0;
        int b = 1;
        int count = 0;
        while(count<=num){
            System.out.println(a +" ");
            int temp = a+b;
            a=b;
            b=temp;
            count++;
        }
        
    }
}




//0,1,1,2,3,5,8,13

//a   |  //b
//0   |  //1
//1   |  //1
//1   |  //2
//2   |  //3
//3   |  //5
//5   |  //8
//8   |  //13