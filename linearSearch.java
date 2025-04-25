public class linearSearch {
    public static void main(String[] args) {
        // arr = [1,2,3,4,5,6,7]
        //if no value has been detected in the array list then return -1;
        
        //time complexity : how the time grows based on your input
        //the worst case of time complexity of linear search is O(n)
        //bext is O(1)

        //space complexity : how much extra memory an algorithm uses as the 
        //input size grows.

        //linear search :

        int[] num = {1,2,3,4,5,6,7,8,9,0};
        int target = 7;
        int ans = linearSearch(num, target);
        System.out.println("Array index of "+target+" is : ");
        System.out.println(ans); 
        int ans2 = linearSearch2(num, target);
        System.out.println("Element is "+ ans2);

    }
    
    //search in the array : 
    //return the index if the item is forund otherwise return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //if the element not found : 
        return -1;
    }

    //if i want to return the lement if the target not the index we can simply use this : 
    static int linearSearch2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            int element = arr[index];
            if(element==target){
                return element;
            }
        }
        //if the element not found : 
        return -1;
    }
}
