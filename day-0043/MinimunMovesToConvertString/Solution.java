class Solution {
    public int minimumMoves(String s) {
        char[] arr = s.toCharArray();
        int count=0;
        
        
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]=='X')
            {
                i=i+2;
                count++;
               
            }
           
        }
       
        return count;
    }
}