class Solution {
    int[][] computers;
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        int cnt = 1;
        for(int i = 0; i < n; i++) {
            boolean isAlone = true;
            for(int j = 0; j < n; j++) {
                if(i == j)
                    continue;
                if(computers[i][j] > 1) {
                    isAlone = false;
                    continue;
                }
                if(computers[i][j] == 1) {
                    isAlone = false;
                    cnt++;
                    computers[i][j] = cnt;
                    computers[j][i] = computers[i][j];
                    dfs(j, cnt, n);
                }
            }
            if(isAlone)
                cnt++;
        }
        return cnt - 1;
    }

    private void dfs(int i, int cnt, int n) {
        for(int j = 0; j < n; j++) {
            if(i == j || computers[i][j] > 1)
                continue;
            if(computers[i][j] == 1) {
                computers[i][j] = cnt;
                computers[j][i] = computers[i][j];
                dfs(j, cnt, n);
            }
        }
    }
}