class Solution {
    public int maxInstance(String s) {
        // Code here
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='b' || ch=='l' || ch=='n' || ch=='o')
                map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        map.put('l', map.get('l')/2);
        map.put('o', map.get('o')/2);
        int ans=Integer.MAX_VALUE;
        for(char x: map.keySet())
            ans=Math.min(map.get(x), ans);
        
        return ans;
    }
}
