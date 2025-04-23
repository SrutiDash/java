import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 33;
        arr[1] = 55;
        arr[2] = 13;
        arr[3] = 25;
        arr[4] = 43;
        System.out.println(arr[2]);

        //input using for loop :
        //here we knpow the arrray size but what is we dint know?
        // for(int i=0;i<5;i++){
        //     //body
        // }
        //we can simply use arr.length :
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        // int length = input.nextInt();
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Array elements are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
