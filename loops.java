import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a b and c : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max +" is largest");

        //or

        //Math.max method
        int max1=Math.max(a, Math.max(a,b));
        System.out.println(max1);
        //direclty
        System.out.println("Largest is "+Math.max(a,Math.max(b,c)));
    }
}
