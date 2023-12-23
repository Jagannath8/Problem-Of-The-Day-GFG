class Solution {
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        int div = (int)Math.floor(n/k);
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
           hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        
        for(int key : hm.keySet()){
            if(hm.get(key)>div)
                count++;
            else 
                continue;
        }
        return count;
    }
}
