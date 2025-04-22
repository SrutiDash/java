import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit num : ");
        int num = input.nextInt();
        System.out.println(answer(num));

        System.out.println("All 3 digit armstrong numbers are : ");
        for(int i=100;i<1000;i++){
            if(answer(i)){
                System.out.println(i + " ");
            }
        }
    }

    static boolean answer(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }
        if(sum==original){
            return true;
        }
        return false;
    }
}
