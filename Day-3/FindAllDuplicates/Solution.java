import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li= new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
               li.add(nums[i]);
            }
        }
        return li;
    }
}