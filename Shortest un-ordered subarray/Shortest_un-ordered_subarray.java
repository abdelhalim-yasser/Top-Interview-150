class Solution {

    public int shortestUnorderedSubarray(int arr[]) {
        boolean increase = false;
        boolean decrease = false;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] < arr[i])
               increase = true;
            if(arr[i-1] > arr[i])
               decrease =true;   
        }
        
        if(increase && decrease)
           return 3;
           
        return 0;   
    }
}
