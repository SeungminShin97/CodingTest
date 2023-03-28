import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x - 1][y - 1] = 1;
            arr[y - 1][x - 1] = 1;
        }
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i][0] != 3) {
                for(int j = 0; j < n; j++) {
                    if(arr[i][j] == 1) {
                        arr[i][j] = 2;
                        arr[j][i] = 2;
                        q.add(i);
                        q.add(j);
                        while(q.size() > 0) {
                            int qnum = q.peek();
                            if(arr[qnum][0] != 3) {
                                for(int k = 0; k < n; k++) {
                                    if(arr[qnum][k] == 1) {
                                        arr[qnum][k] = 2;
                                        arr[k][qnum] = 2;
                                        q.add(k);
                                    }
                                }
                                arr[qnum][0] = 3;
                            }
                            q.poll();
                        }
                        cnt++;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(arr[i][0] == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
