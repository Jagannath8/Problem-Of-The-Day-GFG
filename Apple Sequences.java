class Solution{
    public static int appleSequence(int n, int m, String arr){
        //code here
        int start=0, count=0, max=0;
        char ch[]=arr.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]=='A')
                max=Math.max(max, i-start+1);
            
            if(ch[i]=='O'){
                count++;
                if(count>m){
                    while(start<i && ch[start]=='A')
                        start++;
                    
                    start++;
                }
                max=Math.max(max, i-start+1);
            }
        }
        return max;
    }
}
