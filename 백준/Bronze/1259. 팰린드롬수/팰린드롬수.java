import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		do {
			int output = 0;
			int n = Integer.toString(a).length() - 1;
			for(int i = 0; i < Integer.toString(a).length(); i++) {
				if(i == n && i > n)
					break;
				else {
					if(Integer.toString(a).charAt(i) != Integer.toString(a).charAt(n)){
						output = 1;
						break;
					}
				}
				n--;
			}
			System.out.println((output == 1) ? "no" : "yes");
			a = sc.nextInt();
		}
		while(a != 0);
		sc.close();
	}
}