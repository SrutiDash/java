import java.util.Arrays;
import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Length of the row : ");
        System.out.println(arr.length);

        for(int row=0; row <arr.length;row++){
            //for each column in every row :
            for(int col=0;col<arr[row].length;col++){
                System.out.println("Enter value of ("+row+","+col+") : ");
                arr[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }        
    }
}

