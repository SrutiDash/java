public class maxArray {
    public static void main(String[] args) {
        int[] arr = {17,2,3,4,15,16,7};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 5));
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

    //to check between a particular range
    static int maxRange(int arr[], int start, int end){
        int maxValue = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
