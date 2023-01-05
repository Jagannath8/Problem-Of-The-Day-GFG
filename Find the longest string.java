class Solution {
    public static String longestString(int n, String[] arr) {
        // code here
        Set<String> set=new HashSet<>();
        for(String s:arr){
            set.add(s);
        }
        String ans="";
        for(String s:arr){
            if(s.length()<ans.length()){
                continue;
            }
            else{
                if(allPrefix(s,set)){
                    if(s.length()>ans.length())
                        ans=s;
                    else{
                        if(s.compareTo(ans)<0)
                            ans=s;
                    }
                }
            }
        }
        return ans;
    }
    
    static boolean allPrefix(String s, Set<String> set){
        for(int i=1;i<s.length();i++){
            String sub=s.substring(0,i);
            if(!set.contains(sub))
                return false;
        }
        return true;
    }
}
        
