import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>(m);
        int cnt = -1;
        if(m == 0){
            if(n == 100)
                System.out.println("0");
            else {
                System.out.println((Integer.toString(n).length() > (int)Math.abs(n - 100)) ? (int)Math.abs(n - 100) : Integer.toString(n).length());
            }
        }
        else {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if(n == 100)
                System.out.println("0");
            else if(m == 10)
                System.out.println((int)Math.abs(n - 100));
            else {
                for(int i = 0; i < m; i++)
                arr.add(Integer.parseInt(st.nextToken()));
                for(int i = 0; i <= 1000001; i++) {
                    String s = Integer.toString(i);
                    int j = 0;
                    boolean bool = true;
                    while(j < s.length()) {
                        if(arr.contains(s.charAt(j) - '0')) {
                            bool = false;
                            break;
                        }
                        j++;
                    }
                    if(bool == false) continue;
                    int total = (int)Math.abs(n - i) + s.length(); 
                    if(cnt == -1) 
                        cnt = total;
                    else 
                        cnt = (cnt > total) ? total : cnt;
                }
                System.out.print((cnt > (int)Math.abs(n - 100)) ? (int)Math.abs(n - 100) : cnt);
            }
        }
    }
}