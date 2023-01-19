import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < m; j++) 
                arr[i][j] = s.charAt(j) - '0';
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        arr[0][0]++;
        int upcount = 0, downcount = 1, time = 0;
        while(true) {
            if(downcount > 0) {
                int x = q.peek() / m;
                int y = q.peek() % m;
                if(x == (n - 1) && y == (m - 1)) 
                    break;
                if(x > 0 && arr[x - 1][y] == 1) {
                    q.add((m * (x - 1)) + y);
                    arr[x - 1][y]++;
                    upcount++;
                }
                if(x < (n - 1) && arr[x + 1][y] == 1) {
                    q.add((m * (x + 1)) + y);
                    arr[x + 1][y]++;
                    upcount++;
                }
                if(y > 0 && arr[x][y - 1] == 1) {
                    q.add(m * x + (y - 1));
                    arr[x][y - 1]++;
                    upcount++;
                }
                if(y < (m - 1) && arr[x][y + 1] == 1) {
                    q.add(m * x + (y + 1));
                    arr[x][y + 1]++;
                    upcount++;
                }
                q.poll();
                downcount--;
            }
            else {
                downcount = upcount;
                upcount = 0;
                time++;
            }
        }
        System.out.println(time + 1);
    }
}
