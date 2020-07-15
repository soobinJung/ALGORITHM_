package java_algorithm;

import java.util.Scanner;

public class Factorization {
	public static void main(String[] args) {
		
		System.out.println("[ 소 인 수 분 해 ]");
		
		Scanner sc = new Scanner(System.in);
		
		int n, c, k, y;
		int s[] = new int[10];
		
		while(true) {
			n = sc.nextInt();
			
			if( n<2 )break;
			
			c = -1;
			
			do {
				k = 2;
				while ( n%k != 0 ) {
					k++;
				}
				c++;
				s[c] = k;
				n /= k;
				
			}while( n != 1 );
			
			if( c==0 ) {
				System.out.println("소수");
			}else {
				for( y=0; y<=c-1; y++) {
					System.out.printf("%d X ", s[y]);
				}
				System.out.printf("%d", s[c]);
			}
		}
		sc.close();
		
	}

}
