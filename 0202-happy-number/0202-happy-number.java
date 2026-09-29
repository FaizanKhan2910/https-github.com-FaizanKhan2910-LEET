class Solution {
    public boolean isHappy(int n) {

            int slow = n;
            int fast = n;

            do {
                slow = findSqr(slow);
                fast = findSqr(findSqr(fast));
            }while( fast != slow);

            if( slow == 1)
            {
                return true;
            }
            return false;
    }
    private int findSqr(int n)
    {
        int ans = 0;

        while( n > 0)
        {
            int digit = n % 10;
            ans = ans + digit * digit;
            n = n / 10;
        }

        return ans;
    
    }
}