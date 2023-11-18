import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][2];
        int dp[][] = new int[n + 1][k + 1];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int max = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= k; j++) {
                if(arr[i][0] > j)
                    dp[i + 1][j] = dp[i][j];
                else
                    dp[i + 1][j] = Max(dp[i][j], dp[i][j - arr[i][0]] + arr[i][1]);
                max = Max(dp[i + 1][j], max);
            }
        }

        System.out.println(max);
    }

    static int Max(int a, int b) { return (a > b) ? a : b; }
}
