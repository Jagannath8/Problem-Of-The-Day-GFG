class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int start = 0;
        for(int check : arr){
            if(check!=0){
                arr[start] = check;
                start++;
            }
        }
        for(int i = start;i<n;i++){
            arr[i] = 0;
        }
    }
}
