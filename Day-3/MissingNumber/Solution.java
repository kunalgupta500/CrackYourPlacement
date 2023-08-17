import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        Arrays.sort(nums);
        for(i=0;i<n;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
        return i;
    }
}