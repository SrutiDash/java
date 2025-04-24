import java.util.Scanner;

public class practice {

    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.print("Hii ");
        //will not add a next line
        System.out.println("How are you?");
        //print statement
        //------------------------------------------------
        System.out.println("What is your age ?");
        Scanner input = new Scanner(System.in);
        System.out.println("My age is "+input.nextLine());
        System.out.println("What is your name?");
        Scanner input2 = new Scanner(System.in);
        System.out.println("My name is "+input.nextLine()); 
        //user input
        //------------------------------------------------
        String hobby = hobbyOfTheUser();
        System.out.println("My hobby is " + hobby);
        //declaring here in the main method
    }

    public static String hobbyOfTheUser(){
        System.out.println("What is your hobby?");
        Scanner input3 = new Scanner(System.in);
        return input3.nextLine();
        //creating a method for hobby without using void
    }
    
}
