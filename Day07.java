class Solution {
    public int change(int amount, int[] coins) {
        if(amount == 0) return 1;
        
        int dp[][] = new int[coins.length+1][amount+1];
        int i = 0, j = 0;
        
        for(i = 0; i < dp.length; i++)
            dp[i][0] = 1;
        
        for(i = 0; i < dp[0].length; i++)
            dp[0][i] = 0;
        
        for(i = 1; i < dp.length; i++){
            for(j = 1; j < dp[i].length; j++){
                dp[i][j] = dp[i-1][j] + (coins[i-1] <= j ? dp[i][j-coins[i-1]] : 0);
            }
        }
        return dp[coins.length][amount];   
    }    
}
/*
Technique   : Dynamic Programming (Recursive one leads to TLE)
Time complexity : O(m*n)
Space complexity: O(m*n)
Useful link     : https://www.youtube.com/watch?v=DJ4a7cmjZY0
*/
