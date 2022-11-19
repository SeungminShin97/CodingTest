import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_front"))
                dq.addFirst(Integer.parseInt(st.nextToken()));
            else if(s.equals("push_back"))
                dq.addLast(Integer.parseInt(st.nextToken()));
            else if(s.equals("pop_front")) {
                if(dq.size() == 0)
                    sb.append("-1\n");
                else
                    sb.append(dq.pollFirst() + "\n");   
            } else if(s.equals("pop_back")) {
                if(dq.size() == 0)
                    sb.append("-1\n");
                else   
                    sb.append(dq.pollLast() + "\n");
            } else if(s.equals("size"))
                sb.append(dq.size() + "\n");
            else if(s.equals("empty"))
                sb.append((dq.isEmpty()) ? "1\n" : "0\n");
            else if(s.equals("front")) {
                if(dq.size() == 0)
                    sb.append("-1\n");
                else
                    sb.append(dq.peekFirst() + "\n");
            }
            else {
                if(dq.size() == 0)
                    sb.append("-1\n");
                else
                    sb.append(dq.peekLast() + "\n");
            }
        }
        System.out.println(sb);
    }
}