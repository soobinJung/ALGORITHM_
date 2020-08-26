package soobin;

public class LicensKeyFormatting {
	public static void main(String[] args) {
		String str = "8F3Z-2e-9-wabcdef";
		int k = 4;
		solve(str, k);
	}

	public static String solve(String str, int k) {
		
		String newStr= str.replace("-","");
		System.out.println("newStr : " + newStr);
		
		newStr = newStr.toUpperCase();
		System.out.println("newStr : " + newStr);
		
		int leng = newStr.length();
		
		StringBuilder sb = new StringBuilder();
		
		for( int i=0; i<leng; i++ ){
			sb.append(newStr.charAt(i));
		}
		
		for( int i=k; i<leng; i= i+k ){
			sb.insert(leng-i, '-');
		}
		
		System.out.println("sb : " + sb );
		
		return newStr;
	}
}
