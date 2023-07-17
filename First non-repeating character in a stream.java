class Solution{
    public String FirstNonRepeating(String A){
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for (char c : A.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) == 1) {
                q.add(c);
            }

            while (!q.isEmpty() && map.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty()) 
                result.append("#");
            else 
                result.append(q.peek());
        }
        return result.toString();
    }
}
