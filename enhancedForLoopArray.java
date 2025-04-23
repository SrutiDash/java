import java.util.Scanner;

public class enhancedForLoopArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the array : ");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter "+length+" elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        //enhanced for loop / for each loop : 
        //syntax for  for each loop :
    
        // for (datatype variable : arrayOrCollection) {
        //     // use variable here
        // }
        
        System.out.println("Elements of the array are : ");
        for(int num : arr){ //for every elemet in the array print the element
            System.out.print(num + " "); //here num represents element of an array
        }
    }
}
