class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer  , Integer> map = new HashMap<>();

        int low = 0;
        int res = 0;

        for(int high = 0; high < fruits.length ; high++)
        {
            //ye dalne ke liye aur jagah badha do okay
            map.put(fruits[high] , 
            map.getOrDefault(fruits[high] , 0) + 1);

            //bhai 2 hi rakh sakte ho na same type ke kitne bhi 
            // rakho 
            while(map.size()  > 2)
            {
                map.put(fruits[low] , 
                map.get(fruits[low]) - 1);

                if( map.get(fruits[low]) == 0)
                {
                    map.remove(fruits[low]);
                }

                low++;
            }

            int len = high - low + 1;
            res  = Math.max( res , len);

        }
        return res;
    }
}