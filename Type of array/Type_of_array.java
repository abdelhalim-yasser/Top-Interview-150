class Solution {
    int maxNtype(int arr[]) {
        int max = 0;
        int min = 0;
        int length = arr.length;
        
        for(int i = 0; i < length; i++) {
            if(arr[max] < arr[i])
               max = i;
            if(arr[i] < arr[min])
                min = i;  
        }
        
        if(min == 0 && max == lenght-1)
           return 1;
        else if(max == 0 && min == length-1)
           return 2;   
        else if(max > min)
           return 3;
           
        return 4;   
   
    }
}
