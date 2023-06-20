class Solution {
    static int matchGame(Long N) {
        // code here
        if((int)(N%5)==0) 
            return -1;
        else 
            return (int)(N%5);
    }
};
