class Solution{
    
    static HashMap<String, Boolean> map;
    static boolean isScramble(String s1,String s2)
    {
        //code here
        map=new HashMap<>();
        return solve(s1,s2);
    }
    
    static boolean solve(String s1, String s2){
        
        int n=s1.length();
        if(s1.equals(s2)){
            map.put(s1+s2, true);
            return true;
        }
        
        if(map.containsKey(s1+s2)){
            return map.get(s1+s2);
        }
            
        
        for(int i=1;i<n;i++){
            String a=s1.substring(0,i);
            String b=s2.substring(0,i);
            String c=s1.substring(i,n);
            String d=s2.substring(i,n);
            
            if(solve(a,b) && solve(c,d)){
                map.put(s1+s2, true);
                return true;
            }
            
            String e=s1.substring(0,i);
            String f=s2.substring(n-i,n);
            String g=s1.substring(i,n);
            String h=s2.substring(0,n-i);
            
            if(solve(e,f) && solve(g,h)){
                map.put(s1+s2, true);
                return true;
            }
        }
        
        map.put(s1+s2, false);
        return false;
    }
}
