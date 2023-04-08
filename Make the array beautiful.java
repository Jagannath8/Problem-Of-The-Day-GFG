class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (l.size()!=0 && ((l.get(l.size()-1)<0 && arr[i]>=0 ) || (l.get(l.size()-1)>=0 && arr[i]<0 )))
                l.remove(l.size() - 1);
            else 
                l.add(arr[i]);
        }

        return l;
    }
}
