class Solution {
    public int countConsistent(int[] nums) {
        int n=nums.length;
        int c=0,min=0;
        for(int i=0;i<n;i++){
            int ans=0;
            for(int j=i;j<n;j++){
               min=Math.min(nums[i],nums[j]);
                 ans = ans & nums[i] & nums[j];
            }
                if(ans==min){
                    c++;
                }
            }
        
        return c;
    }
}