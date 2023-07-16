class Solution{
    public void transpose(int n,int a[][]){
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
}