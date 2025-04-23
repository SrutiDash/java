import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //array is a collection of data types
        //it can be primitive not primitive
        //all the type of data inside an array should be same
        
        //syntax :

        //datatype[] variable_name = new datatype[];
        int[] rollno = new int[5]; //id we know the size of it
        //here new keyword is used to create an object
        //here it will create an array of size 5 in the heap memory
        //or
        System.out.println(rollno[0]);
        //as nothing has been initialied inside the array of size 5
        //there for for data type int the bydefault values in the index is 0 only.
        int[] rollno2 = {1, 2, 3, 4, 5}; //if we know the roll no.s
        System.out.println(rollno2[3]);
        rollno2[3] = 78;
        System.out.println(rollno2[3]);
        System.out.println(Arrays.toString(rollno2));
        String[] arr = new String[7];
        System.out.println(arr[5]);
        //for string it is null if no specifix values  has been initualies to it
        //primitive datatypes are being stored in stack memory lie int char boolean
        //where as non primitive type and other objects being stored in heap memory
    }
}
