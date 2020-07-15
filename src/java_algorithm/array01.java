package java_algorithm;

public class array01 {
	public static void main(String[] args) {
		
		int a[][] = new int[5][5];
		int c = 1;
		for( int i=0; i<a.length; i++ ) {
			
			for( int j=i; j<a[i].length; j++) {
				
				System.out.printf("%3d", c);
				c++;
			}
			System.out.println();
		}
	}
}
