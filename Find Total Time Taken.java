class Solution{
    public static long totalTime(int n,int arr[],int time[]){
        int ans=0;
        HashSet<Integer> set = new HashSet<>(); 
        for(int i = 0; i < n; i++) {
            if(set.contains(arr[i]))
                ans+= time[arr[i]-1];
            else{
                set.add(arr[i]);
                ans++;
            }
          
        }
        return ans-1;
    }
}
