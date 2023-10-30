class Solution{
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        //Complete the function
        long sumXOR = 0;
        for (int i = 0; i < 31; i++) {
            int countZero = 0;
            int countOne = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) == 0) 
                    countZero++;
                else 
                    countOne++;
            }
            sumXOR += (long) countZero * countOne * (1 << i);
        }
        return sumXOR;
    }
}
