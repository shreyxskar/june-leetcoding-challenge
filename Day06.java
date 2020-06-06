class Solution {
    public int[][] reconstructQueue(int[][] people) {
        ArrayList<int[]> al = new ArrayList<>();
        int i;
        for(i = 0; i < people.length; i++)
            al.add(new int[]{people[i][0], people[i][1]});
        
        Collections.sort(al, new Comparator<int[]>(){            
            public int compare(int a[], int b[]){
                if(a[0] == b[0])
                    return a[1]-b[1];
                return b[0]-a[0];
            }
        });
        
        for(i = 0; i < al.size(); i++)
            if(al.get(i)[0] < al.get(al.get(i)[1])[0]){
                int a = al.get(i)[0];
                int b = al.get(i)[1];
                
                al.remove(i);
                al.add(b, new int[]{a, b});
            }        
        
        for(i = 0; i < al.size(); i++){
            people[i][0] = al.get(i)[0];
            people[i][1] = al.get(i)[1];
        } 
        
        return people;
    }    
}
/*
Data structures   : 2D array, ArrayList
Time complexity   : O(n*log(n))
Space complexity  : O(n)
Useful links      : https://www.tutorialspoint.com/queue-reconstruction-by-height-in-cplusplus
                    https://www.youtube.com/watch?v=y21WlLca7gI
*/
