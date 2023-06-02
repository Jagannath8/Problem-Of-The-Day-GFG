class Complete{
    private static final List<Integer> primes = new ArrayList<>();
    private static final int MAX_SIZE = 1_000_000_1;
    public static void precompute () {
        boolean[] isPrime = new boolean[MAX_SIZE];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for(int i = 2; i < MAX_SIZE; i++){
            if(isPrime[i]){
                for(long j = (long)i*i; j < MAX_SIZE; j+= 2*i){
                    isPrime[(int)j] = false;
                }
            }
        }
        primes.add(2);
        for(int i = 3; i < MAX_SIZE; i+=2){
            if(isPrime[i]){
                primes.add(i);
            }
        }
    }
    // Function for finding maximum and value pair
    public static int helpSanta (int n, int m, int g[][]) {
        List<List<Integer>> graph = buildGraph(n,g);
        boolean[] visited = new boolean[n+1];
        int groupSize = 0;
        for(int node = 1; node<=n; node++){
            if(!visited[node]){
                groupSize = Math.max(dfs(node,graph,visited),groupSize);
            }
        }
        return groupSize <= 1 ? -1 : primes.get(groupSize-1);
    }
    
    private static int dfs(int p,List<List<Integer>> graph,boolean[] visited){
        visited[p] = true;
        int count = 1;
        for(int c : graph.get(p)){
            if(!visited[c]){
                count += dfs(c,graph,visited);
            }
        }
        return count;
    }
    
    private static List<List<Integer>> buildGraph(int n,int g[][]){
        List<List<Integer>> graph= new ArrayList<>();
        for(int i = 0; i <= n;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int[] edge : g){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
    
    
}
