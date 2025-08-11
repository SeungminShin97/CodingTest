import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int x;
    public static int y;
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        arr = new int[y][x];

        for(int i = 0; i < y; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < x; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int max = 0;
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                if(arr[i][j] == 0 || arr[i][j] == 2)
                    continue;
                int picture = dfs(i, j, 1);
                if(picture > 0) {
                    cnt++;
                    max = Math.max(max, picture);
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

    public static int dfs(int dy, int dx, int depth) {
        arr[dy][dx] = 2;
        if(dy > 0 && arr[dy - 1][dx] == 1)
            depth = dfs(dy - 1, dx, depth + 1);
        if(dy < y - 1 && arr[dy + 1][dx] == 1)
            depth = dfs(dy + 1, dx, depth + 1);
        if(dx > 0 && arr[dy][dx - 1] == 1)
            depth = dfs(dy, dx - 1, depth + 1);
        if(dx < x - 1 && arr[dy][dx + 1] == 1)
            depth =  dfs(dy, dx + 1, depth + 1);
        return depth;
    }

}