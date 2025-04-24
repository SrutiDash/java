public class maxArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,14,5,6,7};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxValue = arr[0]; //assuming index of 0 is the max element
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
