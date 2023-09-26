class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increa=false;
        boolean decrea=false;
        boolean ans=true;
        for(int i=1;i<nums.length;i++)
        {
            if((nums[i]>nums[i-1]))
            {
                increa= true;
            }
            else if((nums[i]<nums[i-1]))
            {
                decrea=true;
            }
        }
        if(increa && decrea)
        {
            ans=false;
        }
        else
        {
            ans=true;
        }
       
       return ans;
        
        
    }
}