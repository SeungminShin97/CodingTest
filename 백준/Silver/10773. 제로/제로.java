import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0)
                stack.pop();
            else
                stack.add(n);
        }
        if(stack.size() == 0)
            System.out.println(0);
        else {
            int total = 0;
            int stacksize = stack.size();
            for(int i = 0; i < stacksize; i++)
                total += stack.pop();
            System.out.println(total);
        }
    }
}