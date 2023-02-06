import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][][] arr = new int[n][n][2];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < n; j++) {
                if(s.charAt(j) == 'R') {
                    arr[i][j][0] = -1;
                }
                else if(s.charAt(j) == 'G') {
                    arr[i][j][0] = 0;
                }
                else {
                    arr[i][j][0] = 1;
                }
            }
        }
        sb.append(cantsee(arr, n));
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j][0] == -1)
                    arr[i][j][0] = 0;
            }
        }
        sb.append(" " + cantsee(arr, n));
        System.out.println(sb);
    }
    public static int cantsee(int[][][] arr, int n) {
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;
        int color;
        int l = arr[0][0][1];
        for(int i = 0; i < (n * n); i++) {
            if(arr[i / n][i % n][1] == l) {
                arr[i / n][i % n][1] = l + 1;
                q.add(i);
                color = arr[i / n][i % n][0];
                cnt++;
                while(!q.isEmpty()) {
                    int qnum = q.peek();
                    if((qnum / n) > 0 && arr[qnum / n - 1][qnum % n][0] == color && arr[qnum / n - 1][qnum % n][1] == l) {
                        q.add(qnum - n);
                        arr[qnum / n - 1][qnum % n][1] = l + 1;
                    }
                    if((qnum / n) < n - 1 && arr[qnum / n + 1][qnum % n][0] == color && arr[qnum / n + 1][qnum % n][1] == l) {
                        q.add(qnum + n);
                        arr[qnum / n + 1][qnum % n][1] = l + 1;
                    }
                    if((qnum % n) > 0 && arr[qnum/ n][qnum % n - 1][0] == color && arr[qnum/ n][qnum % n - 1][1] == l) {
                        arr[qnum/ n][qnum % n - 1][1] = l + 1;
                        q.add(qnum - 1);
                    }
                    if((qnum % n) < n - 1 && arr[qnum / n][qnum % n + 1][0] == color && arr[qnum / n][qnum % n + 1][1] == l) {
                        arr[qnum / n][qnum % n + 1][1] = l + 1;
                        q.add(qnum + 1);
                    }
                    q.poll();
                }
            }
        }
        return cnt;
    }
}