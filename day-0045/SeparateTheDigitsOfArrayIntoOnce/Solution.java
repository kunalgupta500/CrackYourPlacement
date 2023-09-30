class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> li= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            String s= nums[i]+"";
            for(int j=0;j<s.length();j++)
            {
                li.add(Integer.parseInt(s.charAt(j)+""));
            }
            
        }
        int[] ans = new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            ans[i]=li.get(i);
        }
        return ans;
            }
}