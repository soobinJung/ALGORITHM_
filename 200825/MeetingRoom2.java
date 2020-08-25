package soobin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Interval1 {

	int start;
	int end;

	Interval1() {
		start = 0;
		end = 0;
	}

	Interval1(int s, int e) {
		start = s;
		end = e;
	}
}

public class MeetingRoom2 {
	
	public static void main( String[] args ) {
		
		MeetingRoom2 a = new MeetingRoom2();
		
		Interval1 in1 = new Interval1( 5,  10);
		Interval1 in2 = new Interval1( 15, 20);
		Interval1 in3 = new Interval1( 0,  30);
		
		Interval1[] intervals = {in1, in2, in3};
		
		System.out.println(a.solve(intervals));
		
	}

	public int solve(Interval1[] intervals) {
		
		if( intervals == null || intervals.length==0) {
			return 0;
		}
		
		Arrays.sort(intervals, Comp);
		
		
		Queue<Interval1> heap = new PriorityQueue<Interval1>( intervals.length, Comp2 );
		
		heap.offer(intervals[0]);
		
		for( int i=1; i<intervals.length; i++) {
			
			Interval1 interval = heap.poll();
			
			if( intervals[i].start < interval.end ){
				// 이미 하고 있는 회의가 끝나는 시간보다 새로운 회의가 더 빨리 시작한다면 회의룸이 하나 더 필요하다
				heap.offer(intervals[i]);
			}
			
			heap.offer(interval);
		}
		return heap.size();
	}
	
	Comparator<Interval1> Comp2 = new Comparator<Interval1>() {
		
		@Override
		public int compare(Interval1 o1, Interval1 o2) {
			// TODO Auto-generated method stub
			return o1.end - o2.end;
		}
	};
	
	Comparator<Interval1> Comp = new Comparator<Interval1>() {
		
		@Override
		public int compare(Interval1 o1, Interval1 o2) {
			// 오름차순
			return  o1.start - o2.start;
		}
	};
}



























