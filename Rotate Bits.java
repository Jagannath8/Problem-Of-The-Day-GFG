class Solution{
    ArrayList<Integer> rotate(int N, int D){
        // your code here
        D%=16;
        ArrayList<Integer> al=new ArrayList<>();
        al.add(((N << D) | (N >> 16-D)) & 65535);
        al.add(((N >> D) | (N << 16-D)) & 65535); 
        return al;
    }
}
