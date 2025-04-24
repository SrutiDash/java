import java.util.ArrayList;
import java.util.Scanner;

public class multidimensionalArrayList {
    public static void main(String[] args) {
        //this is array listof array list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(list); //this will be empty as nothing has been specified here like it's legth or capacity
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of list you want : ");
        int length = input.nextInt();
        //initialisation part : 
        for(int i=0;i<length;i++){
            list.add(new ArrayList<>());
        }
        //adding elements to it : 
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                System.out.println("Enter the elements : ");
                list.get(i).add(input.nextInt());
            }
        }

        System.out.println("you 2D arraylist is here : "+list);
    }
}
