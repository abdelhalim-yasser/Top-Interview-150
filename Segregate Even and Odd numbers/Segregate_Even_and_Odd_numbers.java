class Solution {
    void segregateEvenOdd(int arr[]) {
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int stop = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                temp[stop++] = arr[i];
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0)
                temp[stop++] = arr[i];
        }
        
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}
