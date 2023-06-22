class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int f = 0;
        int t = 0;
        int tw = 0;
        for(int i:bills){
            if(i == 5){
                f+=1;
            }
            else if(i == 10){
                t += 1;
                if(f>0)
                    f -=1;
                else
                    return false;
            }
            
            else{
                tw += 1;
                if(t >0){
                    t-=1;
                    if(f>0)
                        f-=1;
                    else
                        return false;
                }
                else if(t==0 && f>=3)
                    f-=3;
                else
                    return false;
            }
        }
        return true;
    }
}
