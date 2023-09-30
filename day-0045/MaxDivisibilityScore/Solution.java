class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
          int n = nums.length;
        int m = divisors.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] d = new int[m];
        for(int i=0;i<m;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(nums[j]%divisors[i]==0)
                {
                    count++;
                }
            }
            d[i] = count;
        }
        for(int i=0;i<m;i++)
        {
            if(d[i]>=max)
            {
                max = d[i];
            }
        }
        for(int i=0;i<m;i++)
        {
            if(d[i]==max)
                 min = Math.min(min,divisors[i]);
        }
        return min;
    }
}