class Solution {
    static List<List<Integer>> v = new ArrayList<>();
    static int[] vis, par;
    static List<Integer> tmp = new ArrayList<>();

    long dfs(int node, int p) {
        vis[node] = 1;
        par[node] = p;
        tmp.add(node);
        
        for (int i : v.get(node)) {
            if (vis[i] == 0) {
                long z = dfs(i, node);
                if (z != -1) {
                    return z;
            }
        } 
        
        else if (vis[i] == 1) {
            long sum = i;
            while (node != i) {
                sum += node;
                node = par[node];
            }
            if (node == i)
                return sum;
            return -1;
        }
    }
    return -1;
}

public long largesSumCycle(int N, int[] Edge) {
    long ans = -1;
    vis = new int[N];
    v = new ArrayList<>();
    par = new int[N];

    for (int i = 0; i < N; i++) 
      v.add(new ArrayList<>());

    for (int i = 0; i < N; i++) {
        if (Edge[i] != -1) 
            v.get(i).add(Edge[i]);
    }

    for (int i = 0; i < N; i++) {
        if (vis[i] == 0) 
            ans = Math.max(ans, dfs(i,-1));

        for (int j : tmp) 
            vis[j] = 2;
            
        tmp.clear();
    }

    return ans;
    }
}
