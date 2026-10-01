class Solution {
    public int countDigits(int num) {
        int count = 0;


        int faizan = num;

        if( num < 10)
        {
                 if(num  %  faizan == 0)
                 {
                    count++;
        }}

        while( num >= 10)
        {
            int original = num;
            while( num != 0)
            {
                int digit = num % 10;
                
                if(original % digit  == 0)
                {
                    count++;
                }

                num = num / 10;

            }
        }
    return count;
    }
}