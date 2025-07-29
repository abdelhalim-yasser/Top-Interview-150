class Solution:
    def floorSqrt(self, n): 
        if n == 0 or n == 1:
            return n
          
        elif(n > 1):
            high = n
            low = 0
            answer = 0
            
            while(low  <= high):
                mid = (high + low) // 2
                
                if(mid * mid == n):
                   return mid
                   
                elif(mid * mid < n):
                    answer = mid
                    low = mid + 1
                
                else:
                    high = mid - 1
            
            return answer
        
        return -1
        
