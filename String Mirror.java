class Solution {
    public static String stringMirror(String s) {
        // code here
        StringBuilder ans = new StringBuilder() ;
        ans.append(s.charAt(0));
        for(int i=1; i < s.length(); i++){
            if(s.charAt(i-1) > s.charAt(i) || (i>1 && s.charAt(i)==s.charAt(i-1))) 
                ans.append(s.charAt(i));
            
            else 
                break;
        }
        String curr = ans.toString();
        return curr+ ans.reverse().toString();
    }
}
