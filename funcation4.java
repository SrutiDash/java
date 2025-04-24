import java.util.Scanner;

public class funcation4 {
    public static void main(String[] args) {
       String result = name();
       System.out.println("Your name is "+result);
    }

    static String name(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String yourName = input.nextLine();
        return yourName;
    }
    
}
