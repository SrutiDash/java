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
    }
}
