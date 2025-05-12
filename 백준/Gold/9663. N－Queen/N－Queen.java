import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int n;
    static boolean[][] diagArr;
    static boolean[] colArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        diagArr = new boolean[2][3 * n - 2];
        colArr = new boolean[n];

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int dx = n - 1 + i;
            colArr[i] = true;
            diagArr[0][dx] = true;
            diagArr[1][dx] = true;
            cnt += dfs(1);
            colArr[i] = false;
            diagArr[0][dx] = false;
            diagArr[1][dx] = false;
        }
        System.out.println(cnt);
    }

    static int dfs(int y) {
        if(y == n)
            return 1;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            int dx = n - 1 + i;
            if(colArr[i] || diagArr[0][dx - y] || diagArr[1][dx + y])
                continue;
            colArr[i] = true;
            diagArr[0][dx - y] = true;
            diagArr[1][dx + y] = true;
            cnt += dfs(y + 1);
            colArr[i] = false;
            diagArr[0][dx - y] = false;
            diagArr[1][dx + y] = false;
        }
        return cnt;
    }
}
