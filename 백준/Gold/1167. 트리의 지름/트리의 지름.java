import java.io.*;
import java.util.*;

class Node {
    public int e;
    public int distance;
    Node(int e, int distance) {
        this.e = e;
        this.distance = distance;
    }
}

public class Main {
    static boolean visit[];
    static ArrayList<Node>[] list;
    static int maxDistance;
    static int maxNode; 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int v = Integer.parseInt(br.readLine());
        list = new ArrayList[v + 1];
        visit = new boolean[v + 1];

        for(int i = 0; i < v + 1; i++) 
            list[i] = new ArrayList<>();

        for(int i = 1; i <= v; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            while (true) {
                int e = Integer.parseInt(st.nextToken());
                if(e == -1)
                    break;
                int d = Integer.parseInt(st.nextToken());
                list[n].add(new Node(e, d));
            }
        }

        visit[1] = true;
        dfs(1, 0);
        Arrays.fill(visit, false);
        visit[maxNode] = true;
        dfs(maxNode, 0);
        System.out.println(maxDistance);
    }

    static void dfs(int e, int distance) {
        if(distance > maxDistance) {
            maxDistance = distance;
            maxNode = e;
        }
        for(int i = 0; i < list[e].size(); i++) {
            Node node = list[e].get(i);
            if (visit[node.e] == false) {
                visit[node.e] = true;
                dfs(node.e, distance + node.distance);
            }
        }
    }
}


