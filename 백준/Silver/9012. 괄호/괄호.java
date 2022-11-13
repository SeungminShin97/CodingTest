import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        boolean pass = true;
        while(n --> 0) {
            pass =true;
            String s = br.readLine();
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(') 
                    stack.push(1);
                else {
                    if(stack.size() >= 1)
                        stack.pop();
                    else {
                        pass = false;
                        continue;
                    }
                }
                
            }
            if(pass == true && stack.size() == 0) {
                System.out.println("YES");
            }else System.out.println("NO");
            stack.clear();
        }
    }
}