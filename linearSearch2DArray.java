public class linearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr= {
            {1,23,4},
            {4,5,6,7},
            {3,61,8,63},
            {2,55}
        };
        int target = 6;

        int[] ans = LinearSearch2DArray(arr, target);

        if(ans[0]!= -1){
            System.out.println("Element "+target+" is found at row "+(ans[0]+1)+" and column "+(ans[1]+1));
        }else{
            System.out.println("Element not found");
        }
    }

    static int[] LinearSearch2DArray(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{-1, -1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target==arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
