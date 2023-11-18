import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.StringTokenizer;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for(int asdf = 0; asdf < tc; asdf++) {
            sb.append("#").append(asdf + 1).append(" ");
            int n = Integer.parseInt(br.readLine());
            long arr[] = new long[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++)
                arr[i] = Long.parseLong(st.nextToken());

            long cost = 0;  // 구매가
            long count = 0; // 물건 수
            long max = 0;   // 최댓값
            long sum = 0;
            for(int i = arr.length - 1; i >= 0; i--) {
                if(arr[i] > max) {
                    sum += (max * count) - cost;
                    cost = 0;
                    count = 0;
                    max = arr[i];
                }
                else {
                    cost += arr[i];
                    count++;
                }
            }
            sum += (max * count) - cost;

            sb.append(sum).append("\n");

        }
        System.out.println(sb);
    }

    static int Max(int a, int b) { return (a > b) ? a : b; }
}