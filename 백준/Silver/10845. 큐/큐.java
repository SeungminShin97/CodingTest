import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push"))
                queue.add(Integer.parseInt(st.nextToken()));
            else if(s.equals("pop")) {
                if(queue.size() == 0) 
                    sb.append("-1\n");
                else{
                    sb.append(queue.peek() + "\n");
                    queue.poll();
                } 
            } else if(s.equals("size"))
                sb.append(queue.size() + "\n");
            else if(s.equals("empty")) 
                sb.append((queue.isEmpty()) ? "1\n" : "0\n");
            else if(s.equals("front")) {
                if(queue.size() == 0)
                    sb.append("-1\n");
                else
                    sb.append(queue.peek() + "\n");
            }
            else {
                if(queue.size() == 0)
                    sb.append("-1\n");
                else 
                    sb.append(queue.peekLast() + "\n");
            }
        }
        System.out.println(sb);
    }
}