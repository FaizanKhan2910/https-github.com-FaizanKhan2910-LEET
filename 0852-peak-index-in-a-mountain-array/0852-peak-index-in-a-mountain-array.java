class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int i = 0 ;
        int j =  arr.length;

        while( i <= j)
        {
            if(arr[i] < arr[i+1] && arr[i+1] > arr[i+2])
            {
                return i+1;
            }

            i++;
        }

        return -1;
    }
}