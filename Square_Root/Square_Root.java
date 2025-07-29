class Solution {
    int floorSqrt(int n) {
        if (n == 0 || n == 1)
            return n;
          
        else if(n > 1){
            int high = n;
            int low = 0;
            int answer = 0;
            
            while(low  <= high) {
                int mid = (high + low) / 2;
                
                if(mid * mid == n)
                   return mid;
                   
                else if(mid*mid < n) {
                    answer = mid;
                    low = mid + 1;
                }
                
                else
                    high = mid - 1;
            }
            
            return answer;
        } 
        
        return -1;
    }
}
