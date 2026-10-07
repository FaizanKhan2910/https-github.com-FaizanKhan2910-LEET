class Solution {
    public int[] sortArrayByParity(int[] nums) {

//         int[] ans = new int[nums.length];
//         int k = 0;

//         for(int i = 0 ; i < nums.length; i++)
//         {
//             if( nums[i] % 2 == 0)
//             {
//                 ans[k] = nums[i];
//                 k++;
//             }
//         }
//     for(int i = 0 ; i < nums.length; i++)
//     {
//   if(nums[i] % 2 == 1)
//             {
//                 ans[k] = nums[i];
//                 k++;

//                 }
//         }
    
          
            
            

//         return ans;

int i = 0;
int j = nums.length - 1;

while( i <= j)
{
    if(nums[i] % 2 == 0)
    {
        i++;
    }else if( nums[j] % 2 == 1)
    {
        j--;
    }else

    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
}

return nums;

    }

}