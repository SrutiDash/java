public class searchRange {
    public static void main(String[] args) {
        int[] arr = {12,2,3,445,6,3,5,7,86,4};
        int target = 13;
        System.out.println(linearSearch2(arr, target, 1, 4));
    }

    static int linearSearch2(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }

        for(int index=start;index<end;index++){
            int element = arr[index];
            if(element==target){
                return element;
            }
        }   //normal for loop

        // for (int element : arr) {
        //     if(element==target){
        //         return element;
        //     }
        // }      //for each loop
        
        //if the element not found : 
        return -1;
    }
}
