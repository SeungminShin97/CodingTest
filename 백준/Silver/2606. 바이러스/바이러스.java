import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[][] arr = new int[n][n];
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a - 1][b - 1] = 1;
            arr[b - 1][a - 1] = 1;
            num[a - 1]++;
            num[b - 1]++;
        }
        int computer = 0;
        num[0] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(q.size() > 0) {
            for(int i = 0; i < n; i++) {
                if(arr[q.peek()][i] == 1 && num[i] > 0) {
                    arr[q.peek()][i] = 0;
                    arr[i][q.peek()] = 0;
                    num[i] = 0;
                    q.add(i);
                    computer++;
                }
            }
            q.poll();
        }
        System.out.println(computer);
    }
}