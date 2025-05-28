import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;
    int z;
    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class Main {
    static int destX;
    static int destY;
    static int l;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Point> queue;
        int n = Integer.parseInt(br.readLine());

        int[][] vectorArr = new int[][]
                { {-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};

        boolean[][] chessArr;

        for(int i = 0; i < n; i++) {
            l = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int x =  Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            destX = Integer.parseInt(st.nextToken());
            destY = Integer.parseInt(st.nextToken());

            if(x == destX && y == destY) {
                sb.append(0).append("\n");
                continue;
            }

            chessArr = new boolean[l][l];
            chessArr[y][x] = true;

            queue = new LinkedList<>();
            queue.add(new Point(x, y, 0));

            while(true) {
                Point p = queue.peek();
                if(p.x == destX && p.y == destY) {
                    sb.append(p.z).append("\n");
                    break;
                }
                for(int v = 0; v < 8; v++) {
                    if(0 <= p.y + vectorArr[v][0] && p.y + vectorArr[v][0] < l && 0 <= p.x + vectorArr[v][1] && p.x + vectorArr[v][1] < l && !chessArr[p.y + vectorArr[v][0]][p.x + vectorArr[v][1]]) {
                        Point point = new Point(p.x +  vectorArr[v][1], p.y + vectorArr[v][0], p.z + 1);
                        chessArr[p.y + vectorArr[v][0]][p.x + vectorArr[v][1]] = true;
                        queue.add(point);
                    }
                }
                queue.poll();
            }
        }
        System.out.println(sb.toString());
    }
}
