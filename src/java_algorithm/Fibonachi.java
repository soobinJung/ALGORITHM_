package java_algorithm;

public class Fibonachi {
	
	public static int fibonacci( int n ) {
		if( n == 0 ) {
			return 0;
		}else if(n == 1 ) {
			return 1;
		}else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		for( int i=0; i<10; i++ ) {
			System.out.printf("%d | ", fibonacci(i) );
		}
		
	}
}

