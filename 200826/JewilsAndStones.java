package soobin;

import java.util.HashSet;
import java.util.Set;

public class JewilsAndStones {
	
	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(solve(J,S));
	}

	// Hesh Set 은 중복을 허용하지 않는다
	public static int solve(String jew, String stone) {
		
		Set<Character> set = new HashSet<>();
		
		for( char jewel : jew.toCharArray()) {
			set.add(jewel);
		}
		
		int count = 0;
		
		for(char stoneChar : stone.toCharArray()) {
			System.out.println("stoneChar : "+ stoneChar);
			if( set.contains(stoneChar)) {
				count++;
			}
		}
		return count;
	}
}
