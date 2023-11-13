import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < 10; i++) {
            sb.append("#").append(i + 1).append(" ");
            Long sum = 0L;

            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) 
                arr[j] = Integer.parseInt(st.nextToken());

            for(int j = 3; j <= n - 2; j++) {
                int max = 1000;
                max = (max < arr[j] - arr[j - 2]) ? max : arr[j] - arr[j - 2];
                max = (max < arr[j] - arr[j - 1]) ? max : arr[j] - arr[j - 1];
                max = (max < arr[j] - arr[j + 1]) ? max : arr[j] - arr[j + 1];
                max = (max < arr[j] - arr[j + 2]) ? max : arr[j] - arr[j + 2];
                if(max < 0)
                    max = 0;
                sum += max;
            }
            sb.append(sum).append("\n");
            
        }
        System.out.println(sb);
        
    }
  
}
