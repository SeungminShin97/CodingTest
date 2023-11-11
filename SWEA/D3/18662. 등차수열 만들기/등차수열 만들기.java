import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double a1 = Math.abs(a - (2*b - c)*1.0);
            double b1 = Math.abs(b - (a + c) / 2.0);
            double c1 = Math.abs(c - (2*b - a) * 1.0);
            double x = (a1 > b1) ? ((b1 > c1) ? c1 : b1) : ((a1 > c1) ? c1 : a1);
            System.out.println("#" + test_case + " " + x);	
        }
	}
}