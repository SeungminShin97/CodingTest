import java.util.*;
import java.io.*;

class Solution {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int arr[];

        for(int i = 0; i < 10; i++) {
            sb.append("#").append(i + 1).append(" ");
            br.readLine();
            arr = new int[8];
            int min = 0;
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 8; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr[j] = input;
                if(j == 0)
                    min = input;
                else
                    min = (min > input) ? input : min;
            }

            if(min > 15) {
                int index = min / 15;
                if(min % 15 == 0)
                    index--;
                for (int j = 0; j < 8; j++)
                    arr[j] -= index * 15;
            }

            Queue<Integer> q = new LinkedList<>();
            for(int j = 0; j < 8; j++)
                q.add(arr[j]);

            int count = 0;
            while(true) {
                int n = q.poll();
                n -= (count % 5) + 1;
                if(n <= 0)
                    break;
                q.add(n);
                count++;
            }

            for(int j : q)
                sb.append(j).append(" ");

            sb.append(0).append("\n");
        }
        System.out.println(sb);
    }

}   
