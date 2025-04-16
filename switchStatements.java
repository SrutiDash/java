import java.util.Scanner;

public class switchStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit name : ");
        String fruit = input.nextLine();

        //use of .equals 
        //difference between == and .equals()
        //== It checks if two variables point to the same object in memory
        //ex : int, char, boolean
        //.equals() It checks if two objects have the same value/content, not if they’re the same object
        //ex : String, Integer, ArrayList
        if(fruit.equals("mango")){
            System.out.println("Yellow colored sweet fruit");
        }else if(fruit.equals("apple")){
            System.out.println("a red colored fruit");
        }else if(fruit.equals("orange")){
            System.out.println("orange colored fruit");
        }
    }
}
