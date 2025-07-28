class Solution:

	def maxNtype(self,arr):class Solution:

	def maxNtype(self,arr):
        max, min, len = 0, 0, len(arr)

        for i in range(0 ,len):
            if arr[max] < arr[i]:
                max = i
            if arr[min] > arr[i]:
                min = i
            
       if min == 0 and max == len-1:
           return 1
        elif min == len-1 and max == 0:
            return 2
        elif max > min:
            return 3
        
        return 4      
    max, min, len = 0, 0, len(arr)

    for i in range(0 ,len):
        if 
