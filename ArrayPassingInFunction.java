import java.util.Arrays;

public class ArrayPassingInFunction {
    public static void main(String[] args) {
        int[] array = {3,4,2,4,5};
        System.out.println(Arrays.toString(array));
        System.out.println("After change : ");
        change(array);
        System.out.println(Arrays.toString(array));
    }

    static void change(int[] arr){
        arr[0] = 55;
    }
}
