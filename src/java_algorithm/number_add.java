package java_algorithm;

import java.util.Scanner;

public class number_add {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int a, b, hap, n, k, c;
		
		a=1; b = 1; hap = 2;
		n = scanf.nextInt();
		
		for( k=3; k<=n; k++ ) {
			c = a+b;
			hap += c;
			a = b;
			b = c;
		}
		System.out.printf("%d", hap);
		scanf.close();
	}

}
