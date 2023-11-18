import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());

        for(int t = 0; t < tc; t++) {
            br.readLine();

            int arr[] = new int[101];

            int max = 0;        // 빈도
            int maxIndex = 0;   // 인덱스

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                arr[score]++;
                if(arr[score] > max) {
                    maxIndex = score;
                    max = arr[score];
                }
                else if(arr[score] == max) {
                    maxIndex = Max(maxIndex, score);
                }
            }

            System.out.println("#" + (t + 1) + " " + maxIndex);

        }
    }

    static int Max(int a, int b) { return (a > b) ? a : b; }
}