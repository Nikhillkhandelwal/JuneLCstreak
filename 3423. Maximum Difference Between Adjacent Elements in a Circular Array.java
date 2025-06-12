class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n =nums.length;
        int maxdiff=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            int k=(i+1)%n;
            int ans=Math.abs(nums[i]-nums[k]);
            maxdiff=Math.max(maxdiff,ans);




        }
        return maxdiff;
        
    }
}
