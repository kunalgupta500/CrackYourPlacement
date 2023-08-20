class Solution {
    public String largestOddNumber(String num) {
        char large=num.charAt(0);
        if((num.charAt(num.length()-1)%2)!=0)
        {
            return num;
        }
        for(int i=1;i<num.length();i++)
        {
            if(num.charAt(i)>num.charAt(i-1))
            {
                large=num.charAt(i);
                 if((large%2)!=0)
                 {
                      return large;
                 }
            }
        }
     return "";
    }
}