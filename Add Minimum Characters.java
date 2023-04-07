class Solution{
	public static int addMinChar(String str){
		//code here
    StringBuilder orig =new StringBuilder(str);
		StringBuilder temp=new StringBuilder(str);
	    String s = orig.append('#').append(temp.reverse()).toString();
	    
        int n=s.length();
		int[]lps= LPS(s);
		return str.length()-lps[n-1];
	}
	
	public static int[] LPS(String str){
        int n = str.length();
        int lps[] = new int[n];
        int i = 1, len = 0;
        lps[0] = 0; 
         
        while (i < n){
            if (str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            
            else{
               
                if (len == 0){
                    lps[i] = 0;
                    i++;
                }
                else{
                    len = lps[len - 1];
                }
            }
        }
        
        return lps;
    }
}
