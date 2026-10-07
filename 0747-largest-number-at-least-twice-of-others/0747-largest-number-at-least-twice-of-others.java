class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int SecondLar = Integer.MIN_VALUE;
int index = -1;
        for(int i = 0 ; i <  nums.length ; i++)
        {
            if(nums[i] > largest )
            {
                largest = nums[i];
                index = i;
            }
           
        }

        for(int i = 0; i< nums.length; i++)
        {
            if(nums[i] > SecondLar && nums[i] != largest)
            {
                SecondLar = nums[i];
            }
        }

    if(largest >= 2 * SecondLar)
    {
        return index;
    }

        return -1;
    }
}