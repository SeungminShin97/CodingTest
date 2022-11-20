import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String s = br.readLine();
        boolean output = true;
        while(!s.equals(".")) {
            output = true;
            int i = 0;
            while(s.charAt(i) != '.') {
                if(s.charAt(i) == '(')
                    stack.add('(');
                else if(s.charAt(i) == '[')
                    stack.add('[');
                else if(s.charAt(i) == ')') {
                    if(stack.size() > 0 && stack.peek() == '(') 
                        stack.pop();
                    else {
                        output = false;
                    }
                } 
                else if(s.charAt(i) == ']') {
                    if(stack.size() > 0 && stack.peek() == '[') 
                        stack.pop();
                    else {
                        output = false;
                    }
                }
                i++;
                if(i >= s.length()) {
                    s = br.readLine();
                    i = 0;
                }
            }
            if(output && stack.size() == 0)
                sb.append("yes\n");
            else    
                sb.append("no\n");
            stack.clear();
            s = br.readLine();
        }
        System.out.println(sb);
    }
}