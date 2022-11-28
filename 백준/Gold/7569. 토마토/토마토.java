import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class TOMATO {
    public int x, y, z;
    public TOMATO(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[][][] arr = new int[h][n][m];
        Queue<TOMATO> queue = new LinkedList<>();
        int zero = 0;
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if(arr[i][j][k] == 0)
                        zero++;
                    else if(arr[i][j][k] == 1)
                        queue.add(new TOMATO(i, j, k));
                }
            }
        }
        if(zero == 0) {
            System.out.println(0);
            System.exit(0);
        }
        int cnt = 0;
        while(queue.size() > 0) {
            int i = queue.peek().x;
            int j = queue.peek().y;
            int k = queue.peek().z;
            if(i > 0 && arr[i - 1][j][k] == 0) {
                arr[i - 1][j][k] = arr[i][j][k] + 1;
                queue.add(new TOMATO(i - 1, j, k));
            }
            if(i < arr.length - 1 && arr[i + 1][j][k] == 0) {
                arr[i + 1][j][k] = arr[i][j][k] + 1;
                queue.add(new TOMATO(i + 1, j, k));
            }
            if(j > 0 && arr[i][j - 1][k] == 0) {
                arr[i][j - 1][k] = arr[i][j][k] + 1;
                queue.add(new TOMATO(i, j - 1, k));
            }
            if(j < arr[i].length - 1 && arr[i][j + 1][k] == 0) {
                arr[i][j + 1][k] = arr[i][j][k] + 1;
                queue.add(new TOMATO(i, j + 1, k));
            }
            if(k > 0 && arr[i][j][k - 1] == 0) {
                arr[i][j][k - 1] = arr[i][j][k] + 1;
                queue.add(new TOMATO(i, j, k - 1));
            }
            if(k < arr[i][j].length - 1 && arr[i][j][k + 1] == 0) {
                arr[i][j][k + 1] = arr[i][j][k] + 1;
                queue.add(new TOMATO(i, j, k + 1));
            }
            queue.poll();
        }
        zero = 0;
        for(int[][] i : arr) {
            for(int[] j : i) {
                for(int k : j){
                    if(k == 0) {
                        System.out.println(-1);
                        System.exit(0);
                    }
                    else {
                        cnt = (cnt > k) ? cnt :k;
                    }
                }
            }
        }
        System.out.println(cnt - 1);
    }
}