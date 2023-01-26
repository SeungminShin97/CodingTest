import java.io.*;
import java.util.*;

public class Main {
    public static int white = 0;
    public static int blue = 0;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq;
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            int dsize = Integer.parseInt(br.readLine());
            dq = new LinkedList<>();
            st = new StringTokenizer(br.readLine(), "[|]|,");
            for(int j = 0; j < dsize; j++) 
                dq.add(Integer.parseInt(st.nextToken()));
            int r = 0;
            boolean bool = true;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == 'R')
                    r++;
                else {
                    if(dq.size() == 0) {
                        bool = false;
                        break;
                    }
                    else if(r % 2 == 0) 
                        dq.pollFirst();
                    else
                        dq.pollLast();
                }
            }
            if(!bool)
                sb.append("error\n");
            else
                sb.append(sbstring(dq, r) + "\n");
            dq.clear();
        }
        System.out.println(sb);
    }
    public static String sbstring(Deque dq, int r) {
        StringBuilder sb = new StringBuilder("[");
        while(dq.size() > 0) {
            if(r % 2 == 0) {
                if(dq.size() == 1)
                    sb.append(dq.poll());
                else {
                    sb.append(dq.poll() + ",");
                }
            }
            else {
                if(dq.size() == 1)
                    sb.append(dq.pollLast());
                else {
                    sb.append(dq.pollLast() + ",");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}