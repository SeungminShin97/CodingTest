import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class baechoo {
    public int x, y;
    public baechoo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void jirungee(int[][] arr, int x, int y) {
        if(x > 0 && arr[x - 1][y] == 1) {
            arr[x - 1][y] = 2;
            jirungee(arr, x - 1, y);
        }
        if(x < arr.length - 1 && arr[x + 1][y] == 1) {
            arr[x + 1][y] = 2;
            jirungee(arr, x + 1, y);
        }
        if(y > 0 && arr[x][y - 1] == 1) {
            arr[x][y - 1] = 2;
            jirungee(arr, x, y - 1);
        }
        if(y < arr[x].length - 1 && arr[x][y + 1] == 1) {
            arr[x][y + 1] = 2;
            jirungee(arr, x, y + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] arr = new int[m][n];
            Queue<baechoo> queue = new LinkedList<>();
            for(int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken()); 
                arr[x][y] = 1;
                queue.add(new baechoo(x, y));
            }
            int cnt = 0;
            while(queue.size() > 0) {
                int x = queue.peek().x;
                int y = queue.peek().y;
                if(arr[x][y] == 1) {
                    arr[x][y] = 2;
                    jirungee(arr, x, y);
                    cnt++;
                }
                queue.poll();
            }
            sb.append(cnt + "\n");
        }
        System.out.println(sb);
    }
}