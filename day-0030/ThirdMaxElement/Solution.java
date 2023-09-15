import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        int[] sortedArray = Arrays.stream(nums).distinct().sorted().toArray();
        
        int n = sortedArray.length;
        
        if (n < 3) {
           
            return sortedArray[n - 1];
        } else {
            
            return sortedArray[n - 3];
        }
        
    }
}