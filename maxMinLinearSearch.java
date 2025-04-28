public class maxMinLinearSearch {
    public static void main(String[] args) {
        int[] arr = {-12,2,3,44, -5,6,3,5,7,86,-4};
        System.out.println("Min : "+minLinearSearch(arr));
        System.out.println("Max : "+maxLinearSearch(arr));
        System.out.println("Min range : "+minRange(arr, 2, 7));
        System.out.println("Max range : "+maxRange(arr, 4, 9));
   }

    //return the minimun value in the array
    static int minLinearSearch(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]<min){
               min = arr[index];
            }
        }
        return min;
    }

    //return maximun
    static int maxLinearSearch(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max = arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]>max){
                max = arr[index];
            }
        }
        return max;
    }

    //in between range min : 

    static int minRange(int[] arr, int start, int end){
        if(arr.length==0){
            return -1;
        }

        int min = arr[0];
        for(start=2;start<end;start++){
           if(arr[start]<min){
              min = arr[start];
           }
        }
        return min;
    }

    //max range : 
    static int maxRange(int[] arr, int start, int end){
        if(arr.length==0){
            return -1;
        }

        int max = arr[0];
        for(start=2;start<end;start++){
           if(arr[start]>max){
              max = arr[start];
           }
        }
        return max;
    }
}
