class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n=arr.length;
        if(n<4) 
            return list;
        
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            if(arr[i]>0&&arr[i]>k)
                break;
            if(i>0&&arr[i]==arr[i-1]) 
                continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1&&arr[j]==arr[j-1]) 
                    continue;
                int l=j+1;
                int r=n-1;
                while(l<r){
                    int ll=l;
                    int rr=r;
                    int sum=arr[i]+arr[j]+arr[l]+arr[r];
                    if(sum==k) {
                        list.add(new ArrayList<>(List.of(arr[i],arr[j],arr[l],arr[r])));
                        while(l<r&&arr[l]==arr[ll])
                            l++;
                        while(l<r&&arr[r]==arr[rr])
                            r--;
                    }
                    else if(sum>k) 
                        r--;
                    else 
                        l++;
                }
            }
        }
        return list;
    }
}
