import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        char ch = input.next().trim().charAt(0);
        System.out.println("value is "+ ch); 
    }    
}
