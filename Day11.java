class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length-1, t = 0;
        
        while(t <= r){
            if(nums[t] == 2){
                int a = nums[t];
                nums[t] = nums[r];
                nums[r] = a;
                r--;
            }
            else if(nums[t] == 0){
                int a = nums[t];
                nums[t] = nums[l];
                nums[l] = a;
                l++;
                t++;
            }
            else{
                t++;
            }           
        }        
    }
}
/*
Technique   : 3 position pointers; 1-pass algorithm
Time complexity : O(n)
Space complexity: O(1)
Useful link     : https://www.youtube.com/watch?v=XOX1WvUMpwQ
*/
