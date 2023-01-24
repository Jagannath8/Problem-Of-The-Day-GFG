class Solution {
    void convert(int[] arr, int n) {
        //Code here
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        
        Arrays.sort(temp);
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(temp[i], i);
        }
        
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
    }
}
