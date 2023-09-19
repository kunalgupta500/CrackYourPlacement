class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MIN_VALUE;
        int ind=-1;
        if(nums.length==1)
        {
          if(nums[0]<0)
          {
            return 0;
          }
        }
        for(int i=0;i<nums.length;i++)
        {
            
            if(nums[i]>max)
            {
                ind=i;
                max=nums[i];
            }
        }
        return ind;
    }
}