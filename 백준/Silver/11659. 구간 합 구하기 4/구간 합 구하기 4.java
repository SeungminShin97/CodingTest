import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            if(i == 0) 
                arr[i][1] = arr[i][0];
            else
                arr[i][1] = arr[i - 1][1] + arr[i][0];
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int low = Integer.parseInt(st.nextToken());
            int high = Integer.parseInt(st.nextToken());
            sb.append(arr[high - 1][1] - ((low > 1) ? arr[low - 2][1] : 0) + "\n");
        }
        System.out.println(sb);
    }
}
