class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[]=new int[nums.length];
		for(int i=0;i<nums.length;i+=2)
		{
			result[i]=nums[i/2];
			result[i+1]=nums[nums.length-n];
			n=n-1;
		
		}	
		return result;
    }
}