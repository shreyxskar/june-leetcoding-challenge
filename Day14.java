class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        HashMap<Integer, List<int[]>> hm = new HashMap<>();
        for(int f[]: flights){
            hm.putIfAbsent(f[0], new ArrayList<>());
            hm.get(f[0]).add(new int[]{f[1], f[2]});
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1]-b[1]));
        pq.offer(new int[]{src, 0, K+1});
        
        while(!pq.isEmpty()){
            int c[] = pq.poll();
            int curr = c[0], cost = c[1], stop = c[2];
            
            if(curr == dst) return cost;
            
            if(stop > 0){
                if(!hm.containsKey(curr)) continue;
                
                for(int p[]: hm.get(curr)){
                    pq.offer(new int[]{p[0], cost+p[1], stop-1});
                }
            }
        }        
        
        return -1;
    }
}
/*
Technique       : Graphs (Dijkstra's Algorithm)
Time complexity : O(m*m)
Space complexity: O(m)
Useful link     : https://leetcode.com/problems/cheapest-flights-within-k-stops/discuss/361711/Java-DFSBFSBellman-Ford-Dijkstra's
*/
