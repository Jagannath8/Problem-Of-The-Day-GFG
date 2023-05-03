class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> temp=new HashMap<>();
        for(String s :arr)
            map.put(s,map.getOrDefault(s,0)+1);
            
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            String curr =  e.getKey();  int freq = e.getValue();    
            if(isPalin(curr)) {
                temp.put(curr,freq);
                continue;
            }
            
            StringBuilder sb=new StringBuilder(curr);
            sb.reverse(); 
            int y=map.get(sb.toString())==null ? 0 :  map.get(sb.toString()); 
            if(y==0 || freq!=y) 
                return false;
        }
        
        int cnt=0; 
        for(int i:temp.values()){
            if(i%2==1)    
                cnt++;
        }
        
        if(cnt>1)  
            return false;
        return true;
    }    
    
    public static boolean isPalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
