class Solution{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int arr[][], int n){
        // code here
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.add(sum1);
        res.add(sum2);
        return res;
    }
}
