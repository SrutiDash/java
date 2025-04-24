import java.util.Scanner;

public class arrray4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the length of the array : ");
       int length = input.nextInt();
       System.out.println("Enter "+length+" elements :");
       int[] arr = new int[length];
       for(int i=0;i<arr.length;i++){
           arr[i] = input.nextInt();
       }
       System.out.println("Your array elements are : ");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
       }
    }    
}
