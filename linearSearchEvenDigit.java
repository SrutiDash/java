public class linearSearchEvenDigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7986};
        System.out.println("The number is even? : "+evenDigits(arr, 1));
    }

    //normal check
    static int evenDigits(int[] arr, int i){
        if(arr.length==0){
            return -1;
        }
        if(arr[i] % 2 ==0){
            return 1;
        }
        return -1;
    }

    //inside the array element :
    
}
