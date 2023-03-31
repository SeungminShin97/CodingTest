import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) 
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int renum = recursion(arr, i, j, n, m, 1, 0);
                count = (count > renum) ? count : renum;
                renum = mounrecur(arr, i, j, n, m);
                count = (count > renum) ? count : renum;
            }
        }
        System.out.println(count);
    }

    static int mounrecur(int[][] arr, int x, int y, int n, int m) {
        int max = 0;
        if(x > 0 && x < n - 1) {
            if(y > 0) {
                int mnum = arr[x - 1][y] + arr[x][y] + arr[x + 1][y] + arr[x][y - 1];
                max = (max > mnum) ? max : mnum;
            }
            if(y < m - 1) {
                int mnum = arr[x - 1][y] + arr[x][y] + arr[x + 1][y] + arr[x][y + 1];
                max = (max > mnum) ? max : mnum;
            }
        }
        if(y > 0 && y < m - 1) {
            if(x > 0) {
                int mnum = arr[x][y - 1] + arr[x][y] + arr[x][y + 1] + arr[x - 1][y];
                max = (max > mnum) ? max : mnum;
            }
            if(x < n - 1) {
                int mnum = arr[x][y - 1] + arr[x][y] + arr[x][y + 1] + arr[x + 1][y];
                max = (max > mnum) ? max : mnum;
            }
        }
        return max;
    }

    static int recursion(int[][] arr, int x, int y, int n, int m, int cnt, int position) {
        if(cnt == 4) {
            return arr[x][y];
        }
        else {
            int max = 0;
            if(x > 0 && position != 3){
                int renum = recursion(arr, x - 1, y, n, m, cnt + 1, 1);
                max = (max > renum) ? max : renum;
            }
            if(y > 0 && position != 4) {
                int renum = recursion(arr, x, y - 1, n, m, cnt + 1, 2);
                max = (max > renum) ? max : renum;
            }
            if(x < n - 1 && position != 1) {
                int renum = recursion(arr, x + 1, y, n, m, cnt + 1, 3);
                max = (max > renum) ? max : renum;
            }
            if(y < m - 1 && position != 2) {
                int renum = recursion(arr, x, y + 1, n, m, cnt + 1, 4);
                max = (max > renum) ? max : renum;
            }
            return arr[x][y] + max;
        }
    }
}
