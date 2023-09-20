class Solution {
    public int smallestEqual(int[] nums) {
        int ind=-1;
        for(int i=0;i<nums.length;i++)
        {
            int temp=i % 10;
            if(temp==nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}