class Solution {
    ArrayList<Integer> al;

    public Solution(int[] w) {
        al = new ArrayList<>();
        al.add(w[0]);
        
        for(int i = 1; i < w.length; i++)
            al.add(al.get(i-1)+w[i]);
    }
    
    public int pickIndex() { 
        int i = 0;
        int n = (int)(Math.random()*al.get(al.size()-1));
        while(n >= al.get(i))
            i++;
        return i;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
 /*
 Time complexity  : O(n)
 Space complexity : O(n)
 Useful link      : https://www.youtube.com/watch?v=v-_aEMtgnkI
 */
