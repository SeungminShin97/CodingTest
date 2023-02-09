import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if(m == 0) {
                if(q.isEmpty())
                    sb.append("0\n");
                else 
                    sb.append(q.poll() + "\n");
            }
            else 
                q.add(m);
        }
        System.out.println(sb);
    }
}
