import java.util.Scanner;

public class function6 {
    public static void main(String[] args) {
        //for first method
        String message = myMessage();
        System.out.println("Your message is : "+message);
        //for second method
        String personalMessage = myPersonalMessage("sruti");
        System.out.println("Your message is : "+personalMessage);
        //for third method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        // String name = input.nextLine();
        String myMessage = yourMessage(input.nextLine());
        System.out.println("Your message is : "+myMessage);

    }
    
    static String myMessage(){
        String mess = "Hi, How are you?";
        return mess;
    }

    //we can have multiple methods in a class
    //we can pass the argument and return it

    static String myPersonalMessage(String name){
        String mess = "Hii "+name;
        return mess;
    }

    //or even after passing the argument we want to take user input we can use scanner class
    //ex

    static String yourMessage(String myName){
        String myMessage = "Hi "+myName;
        return myMessage;
    }

}
