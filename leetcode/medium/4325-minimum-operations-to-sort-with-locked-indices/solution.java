class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
        int n=nums.length;
       boolean[] need=new boolean[n];
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            max=Math.max(max,nums[i]);
            if(max>i+1){
                need[i]=true;
                need[i+1]=true;            }
           
        }
        int unlock=0;
            for(int i=0;i<n;i++){
               if(need[i] && locked[i]==1){
                   unlock++;
               }
                if(unlock>k){return -1;}
            }
       int[] bit=new int[n+1];
        long swaps=0;
        
            for(int i=n-1;i>=0;i--){
                int x=nums[i];
                for(int j=x-1;j>0;j -=j &-j)
                {
                    swaps +=bit[j];
                }
                for(int j=x;j<=n;j +=j &-j)
                {
                    bit[j]++;
                }
            
        }
        return (int)(swaps+unlock);
            
        
    }
}