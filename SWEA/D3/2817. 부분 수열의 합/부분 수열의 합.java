import java.util.*;
import java.io.*;

class Solution {
    public static int arr[];
    public static int output;
    public static int k;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            output = 0;
            arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++)
                arr[j] = Integer.parseInt(st.nextToken());

            dfs(n, 0, 0);

            sb.append(output).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int n, int depth, int sum) {
        if(sum >= k || depth == n) {
            if(sum == k)
                output++;
            return;
        }
        dfs(n, depth + 1, sum + arr[depth]);
        dfs(n, depth + 1, sum);
    }

}   
