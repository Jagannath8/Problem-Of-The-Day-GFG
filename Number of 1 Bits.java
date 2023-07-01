class Solution {
    static int setBits(int N) {
        // code here
        int d=0^N;
        int rem;
        int h=0;
        while(d>0){
            rem=d%2;
            d=d/2;
            if (rem==1)
                h=h+1;
        }
        return h;
    }
}
