import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int[] num = new int[3];
        int total = 0;
        for(int i = 0; i < (n - 2); i++) {
            for(int j = i + 1; j < (n - 1); j++) {
                for(int k = j + 1; k < n; k++) {
                    total = arr[i] + arr[j] + arr[k];
                    if(total <= m){
                        if(k == 2){
                            num[0] = i;
                            num[1] = j;
                            num[2] = k;
                        } else if(arr[num[0]] + arr[num[1]] + arr[num[2]] < total) {
                            num[0] = i;
                            num[1] = j;
                            num[2] = k;
                        }
                    }
                }
            }
        }
        total = 0;
        for(int i : num)
            total += arr[i];
        System.out.println(total);
        bw.flush();
    }
}