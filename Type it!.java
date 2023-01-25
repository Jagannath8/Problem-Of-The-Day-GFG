class Solution {
    int minOperation(String s) {
        // code here

        int n=s.length();
        if(n==1) 
            return 1;

        int l=0; 
        int h=n;
        while(h!=1){
            int mid = (l+h)/2 -1;   
            if(s.substring(0,mid+1).equals(s.substring(mid+1, 2*(mid+1))))
                return mid+1 + 1 + (n-2*(mid+1));

            h--;
        }
        return n;
    }
}
