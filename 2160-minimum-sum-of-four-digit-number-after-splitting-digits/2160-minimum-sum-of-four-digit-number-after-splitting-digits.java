
class Solution {
    public int minimumSum(int num) {
        int[] a = new int[4];
        // 4 digit hain to aur answer 23 + 29 hain 2932 ka 
        
       for(int i = 0 ; i < 4; i++)
       {
            a[i] = num % 10;
            num = num / 10;
       }
       Arrays.sort(a);

       return (a[0] + a[1]) * 10 + a[2] + a[3] ;
}

}