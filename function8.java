import java.util.Arrays;

public class function8 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        change(array);
        System.out.println(Arrays.toString(array));
        // basically toString changes the array value to string value
        // here value will change as java chnages the value when it is being passed by referecne(over non primitive types like array)
        // so that's why the value of 0th index has been changed

        // but over primitive type, like int float double
        // it is passed by value to inially it copies the same value
        // and prints the same thing even if we have created a method 
        // to swap or chnage the value of number/string

        // for that we need to use return type(we should not use void)
        // if we are tring to return nultiple values then it is better to
        // return them using wrapper class
    }

    static void change(int[] nums){
        nums[0] = 8;
    }
}
