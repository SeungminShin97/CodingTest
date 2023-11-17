import java.util.*;
import java.io.*;

class Solution {
    public static int arr[][];
    public static int black, white;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());


            black = 0;
            white = 0;
            arr = new int[n + 2][n + 2];
            arr[n / 2 + 1][n / 2 + 1] = 2;
            arr[n / 2][n / 2 + 1] = 1;
            arr[n / 2 + 1][n / 2] = 1;
            arr[n / 2][n / 2] = 2;


            for(int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                arr[x][y] = c;
                osl(x, y);
            }

            for(int j[] : arr) {
                for(int k : j) {
                    if(k == 1)
                        black++;
                    else if(k == 2)
                        white++;
                }
            }

            sb.append(black).append(" ").append(white).append("\n");

        };
        System.out.println(sb);
    }

    static void osl(int x, int y) {
        // 1    black
        // 2    white
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                if(i == 0 && j == 0)
                    continue;
                int x1 = x + i;
                int y1 = y + j;
                boolean change = false;
                while(arr[x1][y1] > 0) {
                    if(arr[x][y] == arr[x1][y1]) {
                        change = true;
                        break;
                    }
                    x1 += i;
                    y1 += j;
                }
                if(change) {
                    while(true) {
                        if(x == x1 && y == y1)
                            break;
                        arr[x1][y1] = arr[x][y];
                        x1 -= i;
                        y1 -= j;
                    }
                }

            }
        }
    }


}
