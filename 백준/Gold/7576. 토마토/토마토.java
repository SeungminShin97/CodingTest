import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class tomato {
    public int x, y;
    public tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        Queue<tomato> queue = new LinkedList<>();
        int zero = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                int t =Integer.parseInt(st.nextToken());
                arr[i][j] = t;
                if(t == 0)
                    zero++;
                else if(t == 1)
                    queue.add(new tomato(i, j));
            }
        }
        if(zero == 0) {
            System.out.println(0);
            System.exit(0);
        }
        while(queue.size() > 0) {
            int x = queue.peek().x;
            int y = queue.peek().y;
            if(x > 0 && arr[x - 1][y] == 0) {
                arr[x - 1][y] = arr[x][y] + 1;
                queue.add(new tomato(x - 1, y));
            }
            if(x < arr.length - 1 && arr[x + 1][y] == 0) {
                arr[x + 1][y] = arr[x][y] + 1;
                queue.add(new tomato(x + 1, y));
            }
            if(y > 0 && arr[x][y - 1] == 0) {
                arr[x][y - 1] = arr[x][y] + 1;
                queue.add(new tomato(x, y - 1));
            }
            if(y < arr[x].length - 1 && arr[x][y + 1] == 0) {
                arr[x][y + 1] = arr[x][y] + 1;
                queue.add(new tomato(x, y + 1));
            }
            queue.poll();
        }
        int cnt = 0;
        for(int[] i : arr) {
            for(int j : i) {
                if(j == 0) {
                    System.out.println(-1);
                    System.exit(0);
                }
                else if(j > 0) 
                    cnt = (cnt > j) ? cnt : j;
            }
        }
        System.out.println(cnt - 1);
    }
}