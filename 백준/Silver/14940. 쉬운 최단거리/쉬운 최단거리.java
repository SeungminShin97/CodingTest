import java.io.*;
import java.util.*;

class XY {
    public int y;
    public int x;

    XY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[][] = new int[n][m];
        XY start;
        Queue<XY> q = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
                if(num == 2) {
                    start = new XY(j, i);
                    q.add(start);
                }
            }
        }
        
        while(!q.isEmpty()) {
            XY xy = q.poll();

            if(xy.y > 0 && arr[xy.y - 1][xy.x] == 1) {
                arr[xy.y - 1][xy.x] = arr[xy.y][xy.x] + 1;
                q.add(new XY(xy.x, xy.y - 1));
            }
            if(xy.y < n - 1 && arr[xy.y + 1][xy.x] == 1) {
                arr[xy.y + 1][xy.x] = arr[xy.y][xy.x] + 1;
                q.add(new XY(xy.x, xy.y + 1));
            }
            if(xy.x > 0 && arr[xy.y][xy.x - 1] == 1) {
                arr[xy.y][xy.x - 1] = arr[xy.y][xy.x] + 1;
                q.add(new XY(xy.x - 1, xy.y));
            }
            if(xy.x < m - 1 && arr[xy.y][xy.x + 1] == 1) {
                arr[xy.y][xy.x + 1] = arr[xy.y][xy.x] + 1;
                q.add(new XY(xy.x + 1, xy.y));
            }
        }

        for(int i[] : arr) {
            for(int j : i) {
                if(j == 0) 
                    System.out.print(j + " ");
                else if(j == 1)
                    System.out.print(-1 + " ");
                else
                    System.out.print((j - 2) + " ");
            }
            System.out.println();
        }


    }
}