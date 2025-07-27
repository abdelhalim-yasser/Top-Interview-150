class Solution:
    def shortestUnorderedSubarray(self, arr):
        increase = False
        decrease = False
        
        for i in range(1, len(arr)):
            if(arr[i-1] < arr[i]):
                increase = True
            if(arr[i-1] > arr[i]):
                decrease = True    
        
        if increase and decrease:
            return 3
        
        return 0 
