class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> res1 = new ArrayList<Integer>();
        boolean ifPresent = false;
        for(int i=0;i<n;i++){
            if(arr[arr[i] % n] >= n){
                if (arr[arr[i] % n] < 2 * n){
                    res1.add(arr[i] % n);
                    ifPresent = true;
                }
            }
            arr[arr[i] % n] += n;
        }

        if (!ifPresent) res1.add(-1);
            Collections.sort(res1);

        return res1;
    }
}
