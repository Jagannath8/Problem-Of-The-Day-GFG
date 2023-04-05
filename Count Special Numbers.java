class Solution {
    public int countSpecialNumbers(int n, int arr[]) {
        // Code here
        Map<Integer, Integer> freq=new HashMap<>();
        HashSet<Integer> unq=new HashSet<Integer>();
        int max=0;
        for(int i=0;i<n;i++){
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
            unq.add(arr[i]);
            max=Math.max(arr[i], max);
        }
        
        HashSet<Integer> sp=new HashSet<Integer>();
        for(int z: unq){
            for(int i=2*z;i<=max;i+=z){
                if(unq.contains(i))
                    sp.add(i);
            }
        }
        
        int ans=0;
        for(Map.Entry<Integer, Integer> x: freq.entrySet()){
            if(x.getValue()>1)
                ans+=x.getValue();
            else if(sp.contains(x.getKey()))
                ans++;
        }
        
        return ans;
    }
}
