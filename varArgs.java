import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        //this is called variable length arguments
        numbers(3,4,6,8,3,5);
        multiple(2, 3, 8,4,5,6,7,8);
        texts(2, 4, "sruti", "dash", "elyy", "hi", "hello");
    }

    //this is basically in for of array so while printing it we need Arrays.toString function
    static void numbers(int ...x){  // if we dont know how many varibles/argumnets we need to pass
        System.out.println(Arrays.toString(x));                            //or there are many arguments we need to pass then we can do it like their data type ...x (we can use anything in place of x for ex : a b c)
    }

    static void multiple(int a, int b, int ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void texts(int a, int b, String ...v){
        //here we can use different datatypes
        //also the variable type arguments shoud be last in the list
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
