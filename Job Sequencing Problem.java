class jobComparator implements Comparator<Job> {
    public int compare(Job j1, Job j2){
        return j2.profit - j1.profit;
    }
}

class Solution{
    int[] JobScheduling(Job arr[], int n){
        // Your code here
        Arrays.sort(arr, new jobComparator());
        int res=0; int tot_job=0;
        boolean[] slot = new boolean[n]; 
        for (int i=0; i<n; i++){
            for (int j= arr[i].deadline-1; j>=0; j--) { 
                if (slot[j]==false){ 
                    res += arr[i].profit;  tot_job++;
			        slot[j] = true;
			        break; 
		        } 
	        } 
	    } 
	    
	   int ans[] = {tot_job, res};
	   return ans;
    }
}
