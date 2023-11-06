class Solution{
    static int[] dr, dc;
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][]){
        // code here
        List<Integer> res=new ArrayList<>();
        for(int[] query: queries){
            int sum=0;
            if(query[0] == 1) {
                dr = new int[]{-1, -1, -1,  0, 0,  1, 1, 1};
                dc = new int[]{-1,  0,  1, -1, 1, -1, 0, 1};
            }
            else{
                dr = new int[]{-2, -2, -2, -2, -2,  2,  2, 2, 2, 2, -1, -1,  0, 0,  1, 1};
                dc = new int[]{-2, -1,  0,  1,  2, -2, -1, 0, 1, 2, -2,  2, -2, 2, -2, 2};
            }
            
            for(int i = 0; i < dr.length; i++) {
                int nr = query[1] + dr[i];
                int nc = query[2] + dc[i];
                if(nr >=0 && nr < n && nc >=0 && nc < m) {
                    sum += mat[nr][nc];
                }
            }
            res.add(sum);
        }
        return res;
    }
}
