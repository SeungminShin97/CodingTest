import java.io.*;
import java.util.*;

class data {
    int num;
    String dslr;

    public data(int num, String dslr) {
        this.num = num;
        this.dslr = dslr;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            StringBuilder sb1 = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[10000];
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Queue<data> q = new LinkedList<>();
            q.add(new data(a, ""));
            while(q.size() > 0) {
                if(q.peek().num == b) 
                    break;
                else if(arr[q.peek().num] == 0){
                    arr[q.peek().num] = 1;
                    q.add(d(q.peek()));
                    q.add(s(q.peek()));
                    q.add(l(q.peek()));
                    q.add(r(q.peek()));
                }
                q.poll();
            }
            sb.append(q.peek().dslr + "\n");
            q.clear();
        }

        System.out.println(sb);
    }
    public static data d(data a) {
        return new data((a.num * 2) % 10000, a.dslr + "D");
    }
    public static data s(data a) {
        return new data(((a.num == 0) ? 9999 : a.num - 1), a.dslr + "S");
    }
    public static data l(data a) {
        return new data((a.num * 10) % 10000 + (a.num / 1000), a.dslr + "L");
    }
    public static data r(data a) {
        return new data((a.num / 10) + ((a.num % 10) * 1000), a.dslr + "R");
    }
}
