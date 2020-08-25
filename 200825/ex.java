package soobin;

import java.util.ArrayList;
import java.util.List;

public class ex {
	public static void main(String[] args) {
		

		        ArrayList<String> pitches = new ArrayList<String>();
		        pitches.add("111");
		        pitches.add("222");
		        pitches.add("333");
		        pitches.add("444");
		        pitches.add("555");
		        pitches.add("666");

		        System.out.println(pitches.get(0));
		        		
		        System.out.println(pitches.get(1));

		        System.out.println("-------pitches.size()---------"+pitches.size());
		        for( int i=0; i<pitches.size(); i++) {
		        	System.out.println(pitches.get(i));
		        }

	}
}
