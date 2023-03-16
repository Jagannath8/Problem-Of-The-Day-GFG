class Solution{
    static String secondSmallest(int S, int D){
        // code here
        if(S>=D*9)
            return "-1";
        
        S=S-1;
        char ans[]=new char[D];
        for(int i=D-1;i>0;i--){
            if(S>9){
                ans[i]=(char)(9+'0');
                S-=9;
            }
            else{
                ans[i]=(char)(S+'0');
                S=0;
            }
        }
        ans[0]=(char)(S+1+'0');
        
        int idx=D-1;
        for(int i=D-1;i>=0;i--){
            if(ans[i]=='9')
                idx=i;
            else
                break;
        }
        
        ans[idx]-=1;
        ans[idx-1]+=1;
        
        return String.valueOf(ans);
    }
}
