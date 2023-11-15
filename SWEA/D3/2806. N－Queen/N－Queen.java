import java.util.*;
import java.io.*;

class Solution {
    public static boolean arr[][];
    public static boolean visit[];
    public static int sum;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            int n = Integer.parseInt(br.readLine());
            arr = new boolean[n][n];
            visit = new boolean[n];

            sum = 0;
            for(int j = 0; j < n; j++) 
                dfs(0, j);
            
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int depth, int n) {
        boolean skip = false;
        for(int i = 1; i <= depth; i++) {
            if(depth >= i) {
                if(n >= i && arr[depth - i][n - i]) {
                    skip = true;
                    break;
                }
                if(n + i < arr.length && arr[depth - i][n + i]){
                    skip = true;
                    break;
                }
            } 
        }
        if(skip)
            return;
        else {
            arr[depth][n] = true;
            visit[n] = true;
            boolean returnSum = true;
            for(int i = 0; i < arr.length; i++) {
                if(!visit[i]) {
                    dfs(depth + 1, i);
                    returnSum = false;
                }
            }
            if(returnSum)
                sum++;
            arr[depth][n] = false;
            visit[n] = false;
        }
    }
  
}   
