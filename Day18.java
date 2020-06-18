class Solution {
    public int hIndex(int[] citations) { 
        int l = 0, r = citations.length-1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(citations[m] < citations.length-m)
                l = m + 1;
            else
                r = m - 1;
        }
        return citations.length-l;
    }
}
/*
Technique       : Binary Search
Time complexity : O(log(n))
Space complexity: O(1)
Useful link     : https://www.youtube.com/watch?v=5D86u5UbdDU
*/
