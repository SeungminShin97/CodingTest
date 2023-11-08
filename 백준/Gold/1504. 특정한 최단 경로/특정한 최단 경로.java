import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    public int distance;
    public int index;
    Node(int distance, int index) {
        this.distance = distance;
        this.index = index;
    }
    @Override
    public int compareTo(Node o) {
        return this.distance < o.distance ? -1 : 1;
    }
}

public class Main {
    public static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        for(int i[] : arr)
            Arrays.fill(i, 300000000);

        for(int i = 0; i <= n; i++) 
            arr[i][i] = 0;

        for(int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arr[a][b] = d;
            arr[b][a] = d;
        }

        st = new StringTokenizer(br.readLine());
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        dijkstra(n, 1);
        dijkstra(n, v1);
        dijkstra(n, v2);
        dijkstra(n, n);

        int output1 = arr[1][v1] + arr[v1][v2] + arr[v2][n];
        int output2 = arr[1][v2] + arr[v2][v1] + arr[v1][n];
        int output = (output1 >= output2) ? output2 : output1;

        System.out.println((output >= 300000000) ? -1 : output);

    }

    static void dijkstra(int n, int row) {
        boolean visit[] = new boolean[n + 1];
        visit[row] = true; 
        PriorityQueue<Node> q = new PriorityQueue<>();

        for(int i = 1; i <= n; i++) {
            if(arr[row][i] != 10000)
                q.add(new Node(arr[row][i], i));
        }
        
        while(!q.isEmpty()) {
            if(visit[q.peek().index]) {
                q.poll();
                continue;
            }

            visit[q.peek().index] = true;
            for(int i = 1; i <= n; i++) {
                if(arr[q.peek().index][i] != 300000000 && !visit[i]) {
                    if(arr[row][i] > q.peek().distance + arr[q.peek().index][i]) {
                        arr[row][i] = q.peek().distance + arr[q.peek().index][i];
                        arr[i][row] = q.peek().distance + arr[q.peek().index][i];
                        q.add(new Node(arr[row][i], i));
                    }
                }
            }
            q.poll();
        }

    }
}


