class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        
        char ch=' ';
        for(int i= 0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                return arr[i];
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        return ch ;
    }
}