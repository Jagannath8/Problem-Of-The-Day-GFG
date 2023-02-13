class Solution{
    int inSequence(int A, int B, int C){
        if(A==B)
            return 1;
        
        if((B>A && C>0) || (A>B && C<0))
            if ((B-A)%C==0 && (B-A)/C>=0)
                return 1;
        
        return 0;
    }
}
