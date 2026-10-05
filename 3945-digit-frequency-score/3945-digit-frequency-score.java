class Solution {
    public int digitFrequencyScore(int n) {
        int[] count = new int[10];
        int sum = 0;
     
        while(n != 0)
        {
            int d = n % 10;
            count[d]++;
            n = n / 10;
            }

            for(int d= 0 ; d < 10 ; d++)
            {
                 sum += count[d] * d;
            }

        return sum;
    }
}