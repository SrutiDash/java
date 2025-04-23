import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
int length = input.nextInt();

int[] arr = new int[length];  // ← Create array with user-defined size

System.out.println("Enter " + length + " elements:");
for(int i = 0; i < arr.length; i++) {
    arr[i] = input.nextInt();
}

System.out.println("Array elements are:");
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}

    }
}
