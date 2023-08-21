class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[] a= s.toCharArray();
        int count=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!=' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}