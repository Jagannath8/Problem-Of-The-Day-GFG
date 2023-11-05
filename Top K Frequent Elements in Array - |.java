class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        Map<Integer, Integer> map=new HashMap<>();
        for(int n:nums)
            map.put(n, map.getOrDefault(n,0)+1);
        Queue<Integer> q=new PriorityQueue<>((a,b)->(map.get(a) == map.get(b)) ? b-a : map.get(b)-map.get(a));
        for(int key: map.keySet())
            q.add(key);
        nums=new int[k];
        for(int i=0;i<k;i++)
            nums[i]=q.remove();
        return nums;
    }
}
