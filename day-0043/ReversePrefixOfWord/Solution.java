class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        
        StringBuilder result = new StringBuilder();
        int temp=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                temp=i;
                
                break;
            }
        }
        for(int j=temp;j>=0;j--)
                {
                    result.append(arr[j]);
                }
        for(int i=temp+1;i<arr.length;i++)
        {
            result.append(arr[i]);
        }
return result.toString();
    }
}