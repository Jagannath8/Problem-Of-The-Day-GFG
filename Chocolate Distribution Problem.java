class Solution{
    public long findMinDiff (ArrayList<Integer> list, int n, int m){
        // your code here
        Collections.sort(list);
        int min = (list.get(m-1)-list.get(0));
        for(int i=1;i<=(n-m);i++){
            min = Math.min(min,(list.get(m-1+i)-list.get(i)));
        }
        return Long.valueOf(min);
    }
}
