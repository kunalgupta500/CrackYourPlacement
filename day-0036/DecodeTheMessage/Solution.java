class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map= new HashMap<>();
    int k=0;
    for(int i=0; i<key.length(); i++)
    {
        if(!map.containsKey(key.charAt(i)) && key.charAt(i)!=' ')
        {
            map.put(key.charAt(i),(char)(97+k));
            k++;
        }
             
    }
    
   
    String ans= "";
    for(int i=0; i<message.length(); i++)
    {
        if(message.charAt(i)==' ')
            ans=ans+' ';
        else
            ans= ans+ map.get(message.charAt(i));
    }
    return ans;
    }
}