import java.util.Arrays;
import java.util.Scanner;

public class input2DArrayCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the row : ");
        int length1 = input.nextInt();
        System.out.println("enter the length of column : ");
        int length2 = input.nextInt();
        int[][] arr = new int[length1][length2];
        
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.println("Enter value of ("+row+","+col+") : ");
                arr[row][col] = input.nextInt();
            }
        }

        System.out.println("hjaghz");
        System.out.println("Your 2D array : ");

        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //or for enhanced for loop :

        System.out.println("Again printing with enhanced for loop : ");
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
    
}
