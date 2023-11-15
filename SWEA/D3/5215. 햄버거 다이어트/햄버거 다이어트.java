import java.util.*;
import java.io.*;

class Solution {
    public static int arr[][];
    public static int limit, max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            arr = new int[n][2];
            max = 0;
            limit = l;
            
            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }

            dfs(0, n, 0, 0);

            sb.append(max).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int index, int depth, int n, int l) {
        if(l > limit)
            return;
        if(index == depth) {
            max = (max > n) ? max : n;
            return;
        }
        dfs(index + 1, depth, n + arr[index][0], l + arr[index][1]);
        dfs(index + 1, depth, n, l);
    }
}   
