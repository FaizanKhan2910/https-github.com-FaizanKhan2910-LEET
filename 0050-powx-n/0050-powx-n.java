class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long num = n;
        boolean negative = false;
            if( num <  0)
            {
                negative = true;
                num = -num;
     
               
            }
            while( num > 0)
            {
                if( num % 2 == 1)
                {
                    ans = ans * x;
                }

                x = x * x;
                num = num / 2;
            }
            if(negative)
            {
                 return 1 / ans;
            }
        return ans;
    }
}