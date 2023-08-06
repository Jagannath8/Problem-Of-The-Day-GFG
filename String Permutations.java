class Solution{
    ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> permutation(String S) {
        totalpermutations(S, "");
        Collections.sort(list);
        return list;
    }
 
    public void totalpermutations(String s, String asof) {
        if (s.length() == 0) {
            list.add(asof);
            return;
        }
 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            String ans = left + right;
            totalpermutations(ans, asof + ch);
        }
    }
}
