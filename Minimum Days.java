class Solution {
    public static int getMinimumDays(int n, String s, int[] p) {
        // code here
        char arr[]=s.toCharArray();
        int pov=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                pov++;
        }
        if(pov==0)
            return 0;
        
        for(int i=0;i<n;i++){
            if(p[i]-1>=0 && p[i]-1<n && arr[p[i]]==arr[p[i]-1])
                pov--;
            if(p[i]+1>=0 && p[i]+1<n && arr[p[i]]==arr[p[i]+1])
                pov--;
                
            arr[p[i]]='?';
            if(pov==0)
                return i+1;
        }
        return 0;
    }
}
