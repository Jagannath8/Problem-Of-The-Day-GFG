class Solution {
    public static ArrayList<Character> easyTask(int n,String s,int q,query queries[]){
        ArrayList<Character> aa = new ArrayList<>();
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<q;i++){
            query queryx =queries[i];
            if(queryx.type=="1"){
                int idx= Integer.parseInt(queryx.a);
                sb.setCharAt(idx,(queryx.b).charAt(0));
            }
            else{
                int st=Integer.parseInt(queryx.a);
                int e=Integer.parseInt(queryx.b);
                int k=Integer.parseInt(queryx.c);
                String wrk = (sb.substring(st,e+1)).toString();
                lexoSort(aa,wrk,k);
            }
        }
        return aa;
    }
    
    public static void lexoSort(ArrayList<Character> aa ,String s,int k){
        int[] str = new int[26];
        for(char c : s.toCharArray() ){
            str[c-'a']++;
        }
        int count =k;
        int i=25;
        for(;i>=0;i--){
            count = count-str[i];
            if(count<=0) 
                break;
        }
        aa.add((char)('a'+i));
    }
}
