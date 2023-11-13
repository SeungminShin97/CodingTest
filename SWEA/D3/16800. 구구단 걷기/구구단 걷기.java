import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < tc; i++) {
            sb.append("#").append(i + 1).append(" ");
            Long n = Long.parseLong(br.readLine());
            Long asdf = Math.round(Math.sqrt(n));
            while(n % asdf != 0) {
                asdf--;
            }
            sb.append(asdf + (n / asdf) - 2).append("\n");
        }
        System.out.println(sb);
        
    }
  
}
