import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            int sum = 0;
            sb.append("#").append(i + 1).append(" ");
            int n = Integer.parseInt(br.readLine());
            for(int j = 1; j <= n; j++) {
                sum += (int) Math.sqrt((n * n) - (j * j));
            }

            sum *= 4;
            sum = sum + 4*n + 1;
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
        
    }
  
}
