class  Solution{
    void shuffleArray(long arr[], int n){
        // Your code goes here
        if(n<=2)
            return;
        int i=1,j=n/2;
        int mod=10001;
        while(i<j){
            arr[i]=arr[i]*mod+arr[j];
            i+=2;
            j++;
        }
        i=n/2-1;
        j=n-2;
        while(i<j){
            arr[j]=arr[i]<mod?arr[i]:arr[i]/mod;
            i--;
            j-=2;
        }
        i=1;
        while(i<n-1) {
            arr[i]%=mod;
            i++;
        }
    }
}
