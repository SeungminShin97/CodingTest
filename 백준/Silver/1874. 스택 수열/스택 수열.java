import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> stack = new Stack<>();
        StringBuffer string = new StringBuffer();
        int n = sc.nextInt();
        int start = 0, poppoint;
        for(int i = 0; i < n; i++) {
            poppoint = sc.nextInt();
            for(int j = start; j < poppoint; j++) {
                stack.push(j + 1);
                string.append("+");
            }
            start = (start > poppoint) ? start : poppoint;
            if(stack.peek() != poppoint) {
                System.out.println("NO");
                System.exit(0);
            }
            stack.pop();
            string.append("-");
        }
        for(int i = 0; i < string.length(); i++) 
            System.out.println(string.charAt(i));
        sc.close();
    }
}