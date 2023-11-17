import java.util.*;
import java.io.*;

class Node {
    public int index;
    public int distance;
    Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }
}

class Solution {
    public static boolean arr[][];
    public static boolean visit[];
    public static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(n == 1) {
                sb.append(1).append("\n");
                continue;
            }

            arr = new boolean[n + 1][n + 1];
            visit = new boolean[n + 1];
            max = 0;

            for(int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = true;
                arr[b][a] = true;
            }

            for(int j = 1; j <= n; j++) {
                visit[j] = true;
                dfs(n, j, 1);
                visit[j] = false;
            }



            sb.append(max).append("\n");
        };
        System.out.println(sb);
    }

    static void dfs(int size, int index, int distance) {
        boolean skip = true;
        for(int i = 1; i <= size; i++) {
            if(arr[index][i] && !visit[i]) {
                skip = false;
                visit[i] = true;
                dfs(size, i, distance + 1);
                visit[i] = false;
            }
        }
        if(skip) {
            max = MAX(max, distance);
        }
    }


    static int MAX(int a, int b) { return (a > b) ? a : b; }
}
