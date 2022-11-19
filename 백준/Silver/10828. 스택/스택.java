import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(n --> 0) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")) 
                stack.add(Integer.parseInt(st.nextToken()));
            else if(s.equals("pop")) {
                if(stack.size() == 0)
                    sb.append("-1\n");
                else {
                    sb.append(stack.peek() + "\n");
                    stack.pop();
                }
            } else if(s.equals("size"))
                sb.append(stack.size() + "\n");
            else if(s.equals("empty")) 
                sb.append((stack.empty()) ? "1\n" : "0\n");
            else{
                if(stack.size() == 0)
                    sb.append("-1\n");
                else 
                    sb.append(stack.peek() + "\n");
            }
        }
        System.out.println(sb);
    }
}
