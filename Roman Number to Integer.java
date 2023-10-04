class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int ans=0;
        int n=str.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1); 
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        ans+=hm.get(str.charAt(n-1));
        for(int i=n-2;i>=0;i--){
            char ch1=str.charAt(i);
            char ch2=str.charAt(i+1);
            if(hm.get(ch1)<hm.get(ch2)) 
                ans-=hm.get(ch1);
            else 
                ans+=hm.get(ch1);
        }
        return ans;
    }
}
