class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        Map<Integer, Integer> x=new  HashMap<>();
        Map<Integer, Integer> y=new  HashMap<>();
        for(int i=0;i<N;i++)
            y.put(A[i], y.getOrDefault(A[i],0)+1);
        
        ArrayList<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            y.put(A[i], y.get(A[i])-1);
            if(y.get(A[i])==0)
                y.remove(A[i]);
            int curr=x.size()-y.size();
            li.add(curr);
            x.put(A[i], x.getOrDefault(A[i],0)+1);
        }
        
        return li;
    }
}
