import java.io.*;
import java.util.*;

public class Main {
    public static int num[];
    public static int arr[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        num = new int[n];
        arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) 
            num[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(num);
        
        dfs(n, m, 0);

        System.out.println(sb);
    }

    static void dfs(int n, int m, int depth) {
        if(m == depth) {
            for(int i : arr) 
                sb.append(num[i]).append(" ");
            sb.append("\n");
            return;
        }
        for(int i = 0; i < n; i++) {
            arr[depth] = i;
            dfs(n, m, depth + 1);
        }
    }
}