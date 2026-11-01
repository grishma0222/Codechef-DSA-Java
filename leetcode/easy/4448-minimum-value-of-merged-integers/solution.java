class Solution {
    public int minMergedInteger(int[] nums) {
        int n=nums.length;
        long min=Long.MAX_VALUE;
        for(int i=0;i<n;i+=2)
        {
            String s=""+nums[i]+nums[i+1];
            long val=Long.parseLong(s);
            min=Math.min(min,val);
        }
        return (int)min;
    }
}