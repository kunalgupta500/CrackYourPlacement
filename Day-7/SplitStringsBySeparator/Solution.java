import java.util.List;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
         List<String> ans = new ArrayList<>();
        int n = words.size(); // length of array
        for(int i = 0; i < n; i++)
        {
            String arr[] = words.get(i).split("[" + separator + "]");
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j].length() > 0) 
                    ans.add(arr[j]);
            }
        }
        return ans;
    }
}