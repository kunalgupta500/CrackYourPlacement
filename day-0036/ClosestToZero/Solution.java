import java.util.Arrays;
import java.lang.Math;
class Solution {
    public int findClosestNumber(int[] nums) {
    Arrays.sort(nums);
    int temp=nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(Math.abs(nums[i])<=min)
            {
                min=Math.abs(nums[i]);
                temp=nums[i];
            }
        }
        return temp;
    }
}