class Solution {
    int dupSub(Node root) {
        // code here 
        solve(root);
        for(Map.Entry<String,Integer> entry: mp.entrySet()){
            if(entry.getValue()>=2)
                return 1;
        }
        return 0;
    }
    
    Map<String,Integer> mp=new HashMap<>();
    public String solve(Node root){
        if(root==null)
            return "$";
        
        StringBuilder s=new StringBuilder();
        if(root.left==null && root.right==null){
            s.append(root.data);
            return s.toString();
        }
        
        s.append(root.data);
        s.append("/");
        s.append(solve(root.left));
        s.append(solve(root.right));
        String key=s.toString();
        mp.put(key, mp.getOrDefault(key,0)+1);
        return key;
    }
}
