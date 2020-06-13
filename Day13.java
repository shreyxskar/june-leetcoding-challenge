class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums.length == 0) return new ArrayList();
        
        List<Integer> al = new ArrayList<Integer>();
        int i, j;
        int c[] = new int[nums.length];
        
        Arrays.fill(c, 1);
        Arrays.sort(nums);
        
        for(i = 1; i < nums.length; i++){
            for(j = i-1; j >= 0; j--){
                if(nums[i]%nums[j] == 0){
                    c[i] = Math.max(c[i], c[j]+1);
                }
            }
        }
        
        int maxIndex = 0;
        for(i = 1; i < nums.length; i++)
            maxIndex = c[i] > c[maxIndex] ? i : maxIndex;        
        
        int t = nums[maxIndex], curr = c[maxIndex];
        for(i = maxIndex; i >= 0; i--){
            if(t%nums[i] == 0 && c[i] == curr){
                al.add(nums[i]);
                curr--;
                t = nums[i];
            }
        }
        
        return al;
    }
}
/*
Technique       : Dynamic Programming
Time complexity : O(n*n)
Space complexity: O(n)
Useful link     : https://www.youtube.com/watch?v=EJUql8PX7DY
*/
