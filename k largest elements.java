class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int[] result = new int[k];
        ArrayList<Integer> list =  new ArrayList<>();
        Arrays.sort(arr);
        for(int i=n-1;i>=n-k;i--)
            list.add(arr[i]);
    
        for(int i=0;i<k;i++)
           result[i]=list.get(i);
           
        return result;
    }
}
