import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n + 1][n + 1];
        int[] num = new int[n + 1];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
            num[a] = 1;
            num[b] = 1;
        }
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        stack.add(v);
        sb.append(v + " ");
        num[v] = 0;
        while(true) {
            boolean b = true;
            for(int i = 0; i <= n; i++) {
                if(arr[stack.peek()][i] == 1 && num[i] == 1) {
                    num[i] = 2;
                    stack.add(i);
                    sb.append(stack.peek() + " ");
                    b = false;
                    break;
                }
            }
            if(b) {
                stack.pop();
                if(stack.empty())
                    break;
            }
        }
        sb.append("\n");
        queue.add(v);
        while(true) {
            for(int i = 0; i <= n; i++) {
                if(arr[queue.peek()][i] == 1 && num[i] > 0) {
                    queue.add(i);
                    num[i] = 0;
                }
            }
            sb.append(queue.peek() + " ");
            queue.poll();
            if(queue.isEmpty())
                break;
        }
        System.out.println(sb);
    }
}