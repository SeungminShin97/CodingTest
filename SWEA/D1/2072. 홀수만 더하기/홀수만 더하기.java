import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 10; i++) {
                int input = Integer.parseInt(st.nextToken());
                if(input % 2 == 1)
                    sum += input;
            }

            System.out.println("#" + test_case + " " + sum);

        }
    }
}