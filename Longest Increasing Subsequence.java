static int longestSubsequence(int size, int a[])
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a[0]);
        
        for(int i=1; i<size; i++) {
            int n = list.size();
            if(a[i] > list.get(n-1)) list.add(a[i]);
            else {
                int index = binarySearch(list, a[i], 0, n-1);
                list.set(index, a[i]);
            }
        }
        return list.size();
    }
    
    static int binarySearch(ArrayList<Integer> list, int a, int left, int right) {
        while( right > left) {
            int mid = (left + right)/2;
            
            if(list.get(mid) >= a) {
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        return right;
    } 
