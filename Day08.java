class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        int p = 1, q = n;
        
        while(q > 0){
            p <<= 1;
            q >>= 1;
        }
        
        p >>= 1;
        return Math.abs(p) == n;
    }
}
/*
Time complexity   : O(numberOfBits)
Space complexity  : O(1)
*/
