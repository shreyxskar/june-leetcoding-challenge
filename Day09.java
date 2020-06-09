class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        
        if(s.equals(t) || s.length() == 0) return true;
        
        int i = 0, j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }     
            else
                j++;
        }  
        return i == s.length();
    }
}
/*
Topic           : Strings
Time complexity : O(n)
Space complexity: O(1)
*/
