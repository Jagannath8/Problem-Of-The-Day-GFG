class Solution{
    public int[] singleNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        // Add numbers to the set if they don't exist, remove if they do
        for (int num : nums) {
            if (numSet.contains(num)) 
                numSet.remove(num);
            else 
                numSet.add(num);
        }
        
        // Convert the set to an array
        int[] result = new int[2];
        int index = 0;
        for (int num : numSet) {
            result[index++] = num;
        }
        
        // Return the result in ascending order
        Arrays.sort(result);
        return result;
    }
}
