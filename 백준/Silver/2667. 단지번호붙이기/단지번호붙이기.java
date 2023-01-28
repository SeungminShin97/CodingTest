import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < n; j++) 
                arr[i][j] = s.charAt(j) - '0';
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == 1) 
                    list.add(asdf(arr, i, j, n));
            }
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int i : list)
            System.out.println(i);
    }
    public static int asdf(int[][] arr, int x, int y, int n) {
        Queue<Integer> q = new LinkedList<Integer>();
        int cnt = 0;
        q.add((n * x) + y);
        while(q.size() > 0) {
            int a = q.peek() / n;
            int b = q.peek() % n;
            if(arr[a][b] == 1) {
                arr[a][b] = 2;
                if(a > 0 && arr[a-1][b] == 1) q.add((n * (a - 1)) + b);
                if(a < (n - 1) && arr[a + 1][b] == 1) q.add((n * (a + 1)) + b);
                if(b > 0 && arr[a][b - 1] == 1) q.add((n * a) + (b - 1));
                if(b < (n - 1) && arr[a][b + 1] == 1) q.add((n * a) + (b + 1)); 
                cnt++;
            }
            q.poll();
        }
        return cnt;
    }
}
