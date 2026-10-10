class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int manday = 1;
        for(int i = 0 ; i < n; i++)
        {
        
            sum += manday + (i % 7);
           // agle ka agla  monday ayega  to 2 plus 
            if( i % 7 == 6)
            {
                manday++;
            }
            
        }

        return sum;
    }
}