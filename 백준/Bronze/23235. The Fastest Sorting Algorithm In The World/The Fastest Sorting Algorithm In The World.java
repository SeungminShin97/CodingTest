import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        while(!br.readLine().toString().equals("0")) {
            System.out.println("Case " + cnt + ": Sorting... done!");
            cnt++;
        }
    }
}