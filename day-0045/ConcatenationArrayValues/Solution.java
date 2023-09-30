class Solution {
    public long findTheArrayConcVal(int[] nums) {
       long result =0;
       if(nums.length==1)
       {
           return (long)nums[0];
       }
       for(int i=0;i<nums.length/2;i++)
       {
           String st=nums[i]+""+nums[nums.length-i-1];
           result = result+Long.parseLong(st);
       }
       if(nums.length%2!=0)
       {
           result = result + nums[nums.length/2];
       }
       return result;
    }
}