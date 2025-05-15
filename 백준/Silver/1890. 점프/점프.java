import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[][] arr = new long[n][n];
        arr[0][0] = 1L;

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                int jump = Integer.parseInt(st.nextToken());
                if(jump == 0)
                    continue;
                if(j + jump < n)
                    arr[i][j + jump] += arr[i][j];
                if(i + jump < n)
                    arr[i + jump][j] += arr[i][j];
            }
        }
        System.out.println(arr[n - 1][n - 1]);
    }
}
