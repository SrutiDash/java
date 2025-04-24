import java.util.Scanner;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //syntax
        //we cannot use primitives here like : int float ..
        //we need to use wrapper classes here like Integer
        ArrayList<Integer> list = new ArrayList<>(2);
        //even if the capacity we have specified as 10 we can still add more into the list
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(27);
        System.out.println(list); //works like Arrays.toString() only
        System.out.println(list.contains(222));
        System.out.println(list.contains(27));
        //list.contains check whether this list contains the value which we have given or not
        list.set(2, 255); //it will replace and update the value associated index 
        System.out.println(list);
        list.remove(4); //it will remove that index
        System.out.println(list);

        //if we want it iterate it/take user input from it :

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values yoy want to iterate : ");
        int length = input.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<length;i++){
            System.out.println("Enter the values you want to add inisde the array list : ");
            list2.add(input.nextInt());
        }

        System.out.println("Your array list is : "+list2);
    }
}
