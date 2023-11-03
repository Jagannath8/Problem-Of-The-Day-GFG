class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        int s[]=new int[n];
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            s[i]=arr[i]*arr[i];
            map.put(s[i],1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=arr[i]*arr[i]+arr[j]*arr[j];
                if(map.containsKey(sum))
                    return true;
            }
        }
        return false;
    }
}
