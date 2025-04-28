public class linearSearchEvenDigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7986};
        System.out.println("The number is even? : "+evenDigits(arr, 1));
        int[] nums = {12,3452,2,6,7986};
        System.out.println(findNum(nums));
        System.out.println(digits1(1221324));
    }


    static int digits1(int num){
        return (int)(Math.log10(num))+1;
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
    static int findNum(int[] num){
        int count = 0;
        for(int n : num){
            if(even(n)){
                count++;
            }
        }
        return count;
    }

    //function to check whether the number has even digits or not?
    static boolean even(int num){
        int numOfDigits = digits(num);
        if(numOfDigits%2==0){
            return true;
        }
        return false;
    }

    //count no of digits in a number : 
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;        
        }
        return count;
    }
}
