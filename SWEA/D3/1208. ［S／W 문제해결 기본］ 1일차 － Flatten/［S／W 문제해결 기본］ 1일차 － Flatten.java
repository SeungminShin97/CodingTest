import java.util.*;
import java.io.*;

class Solution {
    public static int arr[];
    public static int count, max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int arr[];
        
        for(int i = 0; i < 10; i++) {
            sb.append("#").append(i + 1).append(" ");
            arr = new int[101];

            int dump = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 100; j++) {
                arr[Integer.parseInt(st.nextToken())] +=1;
            }            
            int min = 0, max = 0;
            for(int j = 1; j <= 100; j++) {
                if(arr[j] > 0) {
                    min = j;
                    break;
                }
            }
            for(int j = 100; j >= 0; j--) {
                if(arr[j] > 0) {
                    max = j;
                    break;
                }
            }
            for(int j = dump; j > 0; j--) {
                if(max - min < 2)
                    break;
                if(arr[max] > 1) {
                    arr[max]--;
                    arr[max - 1]++;
                }
                else {
                    max--;
                    arr[max]++;
                }
                if(arr[min] > 1) {
                    arr[min]--;
                    arr[min + 1]++;
                }
                else {
                    min++;
                    arr[min]++;
                }
            }
            sb.append(max - min).append("\n");
        }
        System.out.println(sb);
    }

    
  
}   
