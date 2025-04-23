import java.util.Arrays;
import java.util.Scanner;

public class arrayOfObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[5];  // we do not need to take user inout for kength as it is already defined
        System.out.println("Enter the elemets of the array : ");
        for(int i=0;i<str.length;i++){ //using arr.lkength as length is 5 here this is the formant not only when we will be taking usee input of length
            str[i] = input.next();     //taking user input of elemnts of the array
        }
        System.out.println("Elements of the array are : ");    
        System.out.println(Arrays.toString(str));
    }
}

//so here if you enter any integer or something then it will consider it as string only
//as we're taking input.next() which will consoder it as string data type only
