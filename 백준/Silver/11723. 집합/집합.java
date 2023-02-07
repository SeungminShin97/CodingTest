import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[20];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("all")) {
                for(int j = 0; j < 20; j++) 
                    arr[j] = 1;
            }
            else if(s.equals("empty"))
                for(int j = 0; j < 20; j++)
                    arr[j] = 0;
            else {
                int m = Integer.parseInt(st.nextToken());
            if(s.equals("add")) {
                if(arr[m - 1] == 0) 
                    arr[m - 1] = 1;
            }
            else if(s.equals("remove")) {
                if(arr[m - 1] == 1)
                    arr[m - 1] = 0;
            }
            else if(s.equals("check")) 
                sb.append((arr[m - 1] == 1) ? "1\n" : "0\n");
            else if(s.equals("toggle")) {
                if(arr[m - 1] == 1)
                    arr[m - 1] = 0;
                else
                    arr[m - 1] = 1;
            }
            else if(s.equals("all")) {
                for(int j = 0; j < 20; j++) 
                    arr[j] = 1;
            }
            else
                for(int j = 0; j < 20; j++)
                    arr[j] = 0;
            }
        }
        System.out.println(sb);
    }
}
