import java.util.*;
import java.io.*;

class Node {
    public int x;
    public int y;
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            Node p1 = and(p);
            Node q1 = and(q);
            int x = p1.x + q1.x;
            int y = p1.y + q1.y;

            int sum = 0;
            for(int j = 1; j <= x + (y - 1); j++) {
                sum += j;
            }

            sb.append(sum - (y - 1)).append("\n");
        };
        System.out.println(sb);
    }

    static Node and(int a) {
        int i = 1;
        int index = 1;
        while(index < a) {
            i++;
            index += i;
        }
        return new Node(i - (index - a), 1 + (index - a));

    }
}
