class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l <= r){
            int mid = l + ((r-l)>>1);
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }       
        return l;
    }
}
/*
Techniques      : Binary Search
Time complexity : O(log(n))
Space complexity: O(1)
*/
