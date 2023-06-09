class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans = new ArrayList<>();
        Set<String> set=new HashSet<>();
        permutation(S,0,"",set);
        ans.addAll(set);
        Collections.sort(ans);
        return ans;
    }
    
    public static void permutation(String S, int idx, String perm,Set<String> set){
        if(S.length()==0){
            set.add(perm);
            return;
        }
        
        for(int i=0; i<S.length(); i++){
            char cur=S.charAt(i);
            String newString = S.substring(0,i)+S.substring(i+1);
            permutation(newString,idx+1,perm+cur,set);
        }
    }
}
