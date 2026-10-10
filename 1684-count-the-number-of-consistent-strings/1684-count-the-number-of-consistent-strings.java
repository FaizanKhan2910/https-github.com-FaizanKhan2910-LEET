class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch :  allowed.toCharArray()){
            map.put(ch ,  map.getOrDefault(ch , 0 ) + 1);
        }
        int count = words.length;
        for(String s : words){
        for(char ch : s.toCharArray()){
         if( !map.containsKey(ch)){
                    count--;
                    break;
                }
                
            }
        }
        return count;
    }
}