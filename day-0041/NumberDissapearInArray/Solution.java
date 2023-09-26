import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        HashMap<Integer , Integer> mapp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if (!mapp.containsKey(nums[i]))
            {
                mapp.put(nums[i],1);
            }

        }
        for(int i=1;i<=n;i++)
        {
             if (!mapp.containsKey(i))
            {
                li.add(i);
            }
        }
        return li;
    }
}