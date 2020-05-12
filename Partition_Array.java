// Time Complexity : O(nxk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int[] dp = new int[A.length];
        
        for(int i=0; i < dp.length; i++){
            int max = 0;
            for(int j = 1; i-j+1 >= 0 && j <= K; j++){
                max = Math.max(max, A[i-j+1]);
                if(i >= j){
                    dp[i] = Math.max(dp[i],max*j+dp[i-j]);
                }else{
                    dp[i] = Math.max(dp[i],max*j);
                }
            }
        }
        
        return dp[dp.length-1];
    }
}