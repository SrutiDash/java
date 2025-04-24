import java.util.Arrays;
import java.util.Scanner;

public class inputIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the no. of rows you want in your array : ");
        // int length = input.nextInt();
        // int arr[] = new int[length];

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+ " ");
        // }

        System.out.println("Enter the number of elements you want in 1st array : ");
        int length1 = input.nextInt();
        int[] arr1 = new int[length1];
        System.out.println("Enter the elements inside the 1st array : ");
        for(int i=0;i<arr1.length;i++){
            arr1[i] = input.nextInt();
        }

        System.out.println("Enter the number of elements you want in 2nd array : ");
        int length2 = input.nextInt();
        int[] arr2 = new int[length2];
        System.out.println("Enter the elements inside the 2nd array : ");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = input.nextInt();
        }

        System.out.println("Enter the number of elements you want in 3rd array : ");
        int length3 = input.nextInt();
        int[] arr3 = new int[length3];
        System.out.println("Enter the elements inside the 3rd array : ");
        for(int i=0;i<arr3.length;i++){
            arr3[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}