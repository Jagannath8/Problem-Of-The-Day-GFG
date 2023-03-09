class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        // code here
        int n=s.length();
        int arr[]=new int[26];
        for(int i=0;i<n;i++)
            arr[s.charAt(i)-'a']++;
            
        Node p1 = head; 
        Node p2 = head; 
        Node prev=null; 
        int freq[] = new int[26];
        for(int i=0; i<n && p2!=null; i++){
            freq[p2.data-'a']++;
            prev = p2; p2=p2.next;
        }
        
        p2 = prev;

        ArrayList<Node>  ans = new ArrayList<>();
        while(p2.next!=null){
            if(isEqual(arr, freq)){
                ans.add(p1);
                Node t1 =p2;

                p2=p2.next;
                t1.next=null; 

                p1=p2;
                Node prev1 = null;  // same use as we used prev for first window   
                Arrays.fill(freq,0);
                for(int i=0; i<n && p2!=null; i++){
                    freq[p2.data-'a']++;
                    prev1 = p2; p2=p2.next;
                }
                
                p2 = prev1;
            }
            else {
                freq[p1.data-'a']--;
                p1 = p1.next; p2=p2.next;
                freq[p2.data-'a']++;
            }
        }
        
        if(isEqual(arr,freq))
            ans.add(p1);

        return ans;
    }
    
    public static boolean isEqual(int arr[], int freq[]) {
        for (int i = 0; i < 26; i++) {
            if (arr[i] != freq[i]) 
                return false;
        }
        return true;
    }
}
