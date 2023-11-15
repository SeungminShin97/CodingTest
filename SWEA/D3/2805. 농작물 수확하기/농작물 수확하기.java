import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[][];
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            arr = new int[n][n];
            for(int j = 0; j < n; j++) {
                String s = br.readLine();
                for(int k = 0; k < n; k++) 
                    arr[j][k] = s.charAt(k) - '0';
            }
            for(int j = 0; j < n; j++) 
                sum += arr[n / 2][j];
            for(int j = 0; j < n / 2; j++) {
                for(int k = j + 1; k < n - j - 1; k++) {
                    sum += arr[n / 2 + j + 1][k];
                    sum += arr[n / 2 - (j + 1)][k];
                }
            }

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}   
