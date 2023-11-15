import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int arr[][];
        int sum;
        
        for(int i = 0; i < 10; i++) {
            sb.append("#").append(i + 1).append(" ");
            int n = Integer.parseInt(br.readLine());
            arr = new int[8][8];
            for(int j = 0; j < 8; j++) {
                String s = br.readLine();
                for(int k = 0; k < 8; k++) 
                    arr[j][k] = s.charAt(k);
            }

            sum = 0;
            boolean compare;

            for(int j = 0; j <= 8 - n; j++) {
                for(int k = 0; k < 8; k++) {
                    compare = true;
                    for(int l = 0; l < n / 2; l++) {
                        if(arr[j + l][k] != arr[j + n - l - 1][k]) {
                            compare = false;
                            break;
                        }
                    }
                    if(compare)
                        sum++;
                }
            }

            for(int j = 0; j < 8; j++) {
                for(int k = 0; k <= 8 - n; k++) {
                    compare = true;
                    for(int l = 0; l < n / 2; l++) {
                        if(arr[j][k + l] != arr[j][k + n - l - 1]) {
                            compare = false;
                            break;
                        }
                    }
                    if(compare)
                        sum++;
                }
            }
            
            

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

}   
