class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int res = nums[0];
        int minProduct = nums[0];
        for(int i = 1 ; i < nums.length; i++)
        {
            int num = nums[i];
            int temp = maxProduct;
            maxProduct = Math.max( num , Math.max(num * maxProduct, num * minProduct));
            minProduct = Math.min( num , 
            Math.min(num * temp , num * minProduct));
            res = Math.max( maxProduct , res);
        }

        return res;
    }
}