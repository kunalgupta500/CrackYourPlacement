class Solution {
    public int reverse(int x) {
        int ans=0;
        int lastDigit;
        while(x!=0)
        {
           lastDigit= x%10;
           if(ans>(Integer.MAX_VALUE/10) ||ans<(Integer.MIN_VALUE/10))
           {
               return 0;
           }
           ans=ans*10+lastDigit;
           x=x/10;
        }
        return ans;
    }
}