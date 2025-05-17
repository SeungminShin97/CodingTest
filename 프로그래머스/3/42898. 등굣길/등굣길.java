class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] arr = new int[n][m];
        arr[0][0] = 1;
        for(int[] p : puddles) 
            arr[p[1] - 1][p[0] - 1] = -1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == -1)
                    continue;
                if(j < m - 1 && arr[i][j + 1] != -1)
                    arr[i][j + 1] = (arr[i][j + 1] + arr[i][j]) % 1000000007;
                if(i < n - 1 && arr[i + 1][j] != -1)
                    arr[i + 1][j] = (arr[i + 1][j] + arr[i][j]) % 1000000007;
            }
        }
        return arr[n - 1][m - 1];
    }
}