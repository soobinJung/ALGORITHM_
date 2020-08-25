package soobin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Interval2 {

	int start;
	int end;

	Interval2() {
		start = 0;
		end = 0;
	}

	Interval2(int s, int e) {
		start = s;
		end = e;
	}
}

public class MeetingRoom2a {
	
	public static void main( String[] args ) {
		
		MeetingRoom2a a = new MeetingRoom2a();
		
		Interval2 in1 = new Interval2( 5,  10);
		Interval2 in2 = new Interval2( 15, 20);
		Interval2 in3 = new Interval2( 0,  30);
		Interval2 in4 = new Interval2( 45,  60);
		Interval2 in5 = new Interval2( 1,  100);
		Interval2 in6 = new Interval2( 1,  200);
		Interval2 in7 = new Interval2( 8,  300);
		Interval2 in8 = new Interval2( 75,  85);
		Interval2 in9 = new Interval2( 10, 110);
		Interval2 in10 = new Interval2( 1,  5);
		Interval2 in11 = new Interval2( 6,  41);
		
		
		Interval2[] intervals = {in1, in2, in3, in4,in5,in6,in7,in8,in9,in10, in11};
		
		System.out.println(a.solve(intervals));
		
	}

	public int solve(Interval2[] intervals) {
		
		if( intervals == null || intervals.length==0) {
			return 0;
		}
		
		Arrays.sort(intervals, Comp);
		
		for( int i=0; i<intervals.length; i++) {
			System.out.println( " [ " + i + " ] " + intervals[i].start + " ~ "  + intervals[i].end);
		}
		
		Queue<Interval2> heap = new PriorityQueue<Interval2>( intervals.length, Comp2 );
		
		heap.offer(intervals[0]);
		
		for( int i=1; i<intervals.length; i++) {
			
			Interval2 interval = heap.poll();
			
			System.out.println(  intervals[i].start + " < " + interval.end );
			
			if( intervals[i].start < interval.end ){
				// 이미 하고 있는 회의가 끝나는 시간보다 새로운 회의가 더 빨리 시작한다면 회의룸이 하나 더 필요하다
				System.out.println(  "True [ " + i + " ]");
				
				heap.offer(intervals[i]);
			}
			
			heap.offer(interval);
		}
		return heap.size();
	}
	
	Comparator<Interval2> Comp2 = new Comparator<Interval2>() {
		
		@Override
		public int compare(Interval2 o1, Interval2 o2) {
			// TODO Auto-generated method stub
			return o1.end - o2.end;
		}
	};
	
	Comparator<Interval2> Comp = new Comparator<Interval2>() {
		
		@Override
		public int compare(Interval2 o1, Interval2 o2) {
			// 오름차순
			return  o1.start - o2.start;
		}
	};
}