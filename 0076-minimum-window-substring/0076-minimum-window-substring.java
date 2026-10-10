class Solution {
    public String minWindow(String s, String t) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        int low = 0;
        int res = Integer.MAX_VALUE;
        int start = 0;
        int count = t.length();

          for(char ch : t.toCharArray())
          {
            map.put(ch , map.getOrDefault(ch , 0) + 1);
          }
        

        for(int high = 0 ; high < s.length(); high++)
        {
           char ch = s.charAt(high);


            if(map.containsKey(ch))
            {
                if( map.get(ch) > 0) count--;
                map.put(ch , map.get(ch) - 1);
            }

            while(count == 0){
                if(high - low + 1 < res){
                    res = high - low + 1;
                    start = low;
                }

                char left = s.charAt(low);

                if(map.containsKey(left)){
                    map.put(left , map.get(left) + 1);
                     if (map.get(left) > 0) count++;
                }
                low++;
            }
        }

        return res == Integer.MAX_VALUE ? "" : s.substring(start , start+ res); 
    }
}