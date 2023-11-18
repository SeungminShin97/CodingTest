import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
//	    System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};

        int t = Integer.parseInt(br.readLine());

        for(int asdf = 0; asdf < t; asdf++) {
            System.out.println("#" + (asdf + 1) + " ");
            int n = Integer.parseInt(br.readLine());

            int arr[][] = new int[n][n];

            int count = 0;
            int dxy = 0;
            int x = 0, y = 0;
            while(true) {
                if(count == n * n)
                    break;
                arr[x][y] = count + 1;
                count++;
                if(x + dx[dxy] >= arr.length || x + dx[dxy] < 0 || y + dy[dxy] >= arr.length || y + dy[dxy] < 0 || arr[x + dx[dxy]][y + dy[dxy]] > 0) {
                    if(dxy == 3)
                        dxy = 0;
                    else
                        dxy++;
                }

                x += dx[dxy];
                y += dy[dxy];
            }

            for(int i[] : arr) {
                for(int j : i)
                    System.out.print(j + " ");
                System.out.println();
            }

        }
    }

}