import java.util.Scanner;

public class WithoutVoid {
    public static void main(String[] args){
        System.out.println("Hii, How are you?");
        Scanner input = new Scanner(System.in);
        System.out.println("User is" + " "+input.nextLine());
        int age = ageOfTheUser();
        System.out.println("You are " + age + " years old.");

    }   

    public static int ageOfTheUser() {
        System.out.println("Hi, How old are you?");
        Scanner input2 = new Scanner(System.in);
        return input2.nextInt();
    }
}
