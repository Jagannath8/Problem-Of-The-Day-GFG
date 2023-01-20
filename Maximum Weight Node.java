class Solution{
    public int maxWeightCell(int N, int Edge[]){
       int wt[]=new int[N];
       for(int i=0;i<N;i++){
            if(Edge[i]!=-1)
                wt[Edge[i]]+=i;
       }
       
       int max=-1, maxIdx=-1;
       for(int i=0;i<N;i++){
           if(wt[i]>=max){
               max=wt[i];
               maxIdx=i;
           }
       }
       return maxIdx;
    }
}
