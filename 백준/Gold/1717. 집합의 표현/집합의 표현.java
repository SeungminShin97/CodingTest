import java.util.*;
import java.io.*;

public class Main {
    public static int arr[];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        for(int i = 0; i <= n; i++)
            arr[i] = i;

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(input == 0) {
                int a1 = union(a);
                int b1 = union(b);
                if(a1 > b1)
                    arr[a1] = b1;
                else
                    arr[b1] = a1;
            }
            else {
                if(union(a) == union(b))
                    sb.append("YES\n");
                else
                    sb.append("NO\n");
            }
        }

        System.out.println(sb);

    }

    static int union(int a) {
        int a1 = a, a2;
        while(true) {
            a2 = arr[a1];
            if(a1 == a2)
                break;
            int temp = a1;
            a1 = a2;
            a2 = a1;
        }
        arr[a] = a1;
        return a1;
    }
}