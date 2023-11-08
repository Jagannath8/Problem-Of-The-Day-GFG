class Solution{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]){
        // code here 
        ArrayList ans=new ArrayList<>();
        int i,j;
        for(i=0;i<matrix.length;i++){
            if(i%2==0){
                for(j=0;j<matrix.length;j++){
                    ans.add(matrix[i][j]);
                }
            }
            else if(i%2!=0){
                for(j=matrix.length-1;j>=0;j--){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}
