class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int meeting[][]=new int[N][3];
        for(int i=0;i<N;i++){
            meeting[i][0]=i;
            meeting[i][1]=S[i];
            meeting[i][2]=F[i];
        }
        
        Arrays.sort(meeting, Comparator.comparingDouble(o -> o[2]));
        ans.add(meeting[0][0]+1);
        int last=meeting[0][2];
        for(int i=1;i<N;i++){
            if(meeting[i][1]>last){
                ans.add(meeting[i][0]+1);
                last=meeting[i][2];
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
