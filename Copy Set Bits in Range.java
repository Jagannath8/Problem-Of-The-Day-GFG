class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        for(int i=l-1;i<r;i++){
            int bm=(y>>i)&1;
            x|=bm<<i;
        }
        return x;
    }
}
