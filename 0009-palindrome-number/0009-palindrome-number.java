class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int res = 0;
       
        while( x != 0)
        {
             if( x < 0)
        {
            x = -x;
        }
            int d = x % 10;
            res = res * 10 + d;
             x = x / 10;

        }

        if( original == res )
        {
            return true;
        }


        return false;
    }
}