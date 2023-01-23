class Solution {
    public static String removePair(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        
        for(int i=1;i<s.length();i++){
            Character ch=s.charAt(i);
            if(st.isEmpty() || st.peek()!=ch)
                st.push(ch);
                
            else if(st.peek()==ch)
                st.pop();
        }
        
        if(st.isEmpty())
            return "-1";
        
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        
        return str.reverse().toString();
    }
}
