class Solution {
    public void reverseString(char[] s) {
        int n = s.length, i = 0;
        char x;
        while(i < n/2){
            x = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = x;
            i++;
        }
    }
}
/*
Datastructure   : Arrays
Time complexity : O(log(n))
Space complexity: O(1)
*/
