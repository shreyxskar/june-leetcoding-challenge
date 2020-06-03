class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n1 = costs.length>>1, n2 = costs.length>>1, sum = 0;

        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a, b) -> Math.abs(b[0]-b[1])-(Math.abs(a[0]-a[1]))); 
        for(int i[]: costs){
            pq1.add(new int[]{i[0], i[1]});
        }
        
        while(!pq1.isEmpty()){
            int a = pq1.peek()[0];
            int b = pq1.remove()[1];
            
            if(a < b && n1 > 0){
                sum += a;
                n1--;
            }
            else if(a < b && n1 <= 0){
                sum += b;
                n2--;
            }
            else if(b < a && n2 > 0){
                sum += b;
                n2--;
            }
            else{
                sum += a;
                n1--;
            }
            
        } 
        return sum;
    }
}
/*
Datastructure   : Arrays
Time complexity : O(n*log(n))
Space complexity: O(n)
Useful link     : https://www.youtube.com/watch?v=4pwUcdMi2WY
*/
