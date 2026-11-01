class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
        int n=nums.length;
        int unlock=0;
        long swaps=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1 && locked[i]==1){
                unlock++;
            }
            if(unlock>k) return-1 ;
        }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i]>nums[j]){
                        swaps++;
                    }
                }
            }
            return (int)(swaps+unlock);
        
    }
}