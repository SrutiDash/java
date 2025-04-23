import java.util.Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {
        //2D array : 
        // 1 2 3 
        // 4 5 6 
        // 7 8 9
        // for one D array the array is defined like this :
        // int[]
        // for two D array :
        // int[][]

        int[][] arr = new int[3][];
        //here 3 is the no. of rows, right nrxt to it is column which is not necessary to specify
        //adding the rows is mandetory 
        //but even if you specidy numbe rof columns, you'll still need to specify rows

        //2D array : 
        int[][] array = {
            {1, 2, 3},   //{1, 2, 3} this is 0th index of this array
            {4, 5, 6},   //1st
            {7, 8, 9}    //2nd
        };
        //to print 1D array we need to use Arrays.toString
        System.out.println(Arrays.toString(array[1]));
        //so print 2D array we need to print it like this :
        System.out.println(array[1][2]);
        //2D arrray can have varible number of  individual array :
        int[][] array1 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        System.out.println(array1[2][3]);
    }
}
