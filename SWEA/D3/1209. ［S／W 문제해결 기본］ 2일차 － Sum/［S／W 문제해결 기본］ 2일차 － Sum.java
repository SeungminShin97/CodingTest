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

            arr = new int[202];

            for(int j = 0; j < 100; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < 100; k++) {
                    int input = Integer.parseInt(st.nextToken());
                    arr[j] += input;
                    arr[100 + k] += input;
                    if(j == k)
                        arr[200] += input;
                    if(j + k == 99)
                        arr[201] += input;
                }
            }
            int max = 0;
            for(int j : arr) 
                max = (max > j) ? max : j;

            sb.append(max).append("\n");
        }
        System.out.println(sb);
    }

}   
