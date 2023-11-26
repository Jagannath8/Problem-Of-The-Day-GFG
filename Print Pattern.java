class Solution{
    public List<Integer> pattern(int N){
        // code here
        List<Integer> lists=new ArrayList<>();
        lists.add(N);
        if(N<=0) 
            return lists;
        return helper(lists,N-5,0);
    }
    
    List<Integer> helper(List<Integer> list1,int n,int s){
         list1.add(n);
        if(n==list1.get(0)) 
            return list1;
        if(n<=0) 
            s=1;
        if(s==1) 
            return helper(list1,n+5,1);
        else 
            return helper(list1,n-5,0);
    }
}
