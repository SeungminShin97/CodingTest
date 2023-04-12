import java.io.*;
import java.util.*;

public class Main {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		int[] dp = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[i]) {
					dp[i] = Max(dp[i], dp[j] + 1);
				}
			}
			max = Max(max, dp[i]);
		}
		System.out.println(max + 1);
	}

	static int Max(int a, int b) {
		return (a > b) ? a : b;
	}
}