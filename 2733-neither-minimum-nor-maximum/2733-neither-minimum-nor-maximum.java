class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <=2){
            return -1;
        }

    int a = nums[0];
int b = nums[1];
 int c = nums[2];

        if (b > Math.min(a, c) && b < Math.max(a, c)) {
            return b;
        }

        if (a > Math.min(b, c) && a < Math.max(b, c)) {
            return a;
        }

        return c;
    }
}