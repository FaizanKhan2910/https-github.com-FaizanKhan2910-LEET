class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character , Integer> map = new HashMap<>();
        int low = 0;
        int res = 0;

        for(int high = 0 ; high <  s.length() ; high++)
        {
            map.put(s.charAt(high) ,
            map.getOrDefault(s.charAt(high) , 0) + 1);

            while( map.get(s.charAt(high)) > 1 )
            {
                //count ak se jyada hain agar to 
               
                map.put(s.charAt(low)
                ,map.get(s.charAt(low)) - 1);

            low++;

            }

            int len =  high - low + 1;

            res = Math.max( len , res);
        }

        return res;
    }
}