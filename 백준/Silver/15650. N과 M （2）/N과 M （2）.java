import java.io.*;
import java.util.*;

public class Main {
    public static boolean visit[];
    public static int arr[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];

        dfs(n, m, 0, 0);

        System.out.println(sb);
    }

    static void dfs(int n, int m, int depth, int start) {
        if(m == depth) {
            for(int i : arr) 
                sb.append(i).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = start; i < n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1, i);
                visit[i] = false; 
            }
        }
    }
}