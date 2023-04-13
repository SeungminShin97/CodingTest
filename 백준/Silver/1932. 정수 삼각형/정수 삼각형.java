import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n + 1][n + 1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(i != 1) {
					if(j == 1)
						arr[i][j] += arr[i - 1][j];
					else if(j == i)
						arr[i][j] += arr[i - 1][j - 1];
					else {
						arr[i][j] += Max(arr[i - 1][j], arr[i - 1][j - 1]);
					}
				}
			}
		}
		int output = 0;
		for(int i = 0; i <= n; i++) 
			output = Max(output, arr[n][i]);
		System.out.println(output);
	}

	static int Max(int a, int b) {
		return (a > b) ? a : b;
	}
}