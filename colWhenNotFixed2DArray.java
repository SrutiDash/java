import java.util.Scanner;

public class colWhenNotFixed2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Declare a jagged array (rows defined, cols undefined for now)
        int[][] arr = new int[rows][];

        // Ask for column sizes for each row and populate the array
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + (i+1) + ": ");
            int cols = input.nextInt();
            arr[i] = new int[cols]; // Create a new row with that many columns

            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for (" + i + "," + j + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        // Print the jagged array
        System.out.println("\nThe 2D array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) System.out.print(", ");
            }
            System.out.println("},");
        }

        input.close();
    }
}
