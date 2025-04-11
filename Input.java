import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        System.out.println("Hii, How are you?");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        System.out.println("Hi, How old are you?");
        Scanner input2 = new Scanner(System.in);
        System.out.println(input2.nextInt());
    }    
}
