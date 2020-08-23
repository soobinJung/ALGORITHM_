import java.util.Arrays;
import java.util.Comparator;

class Interval{
	int start;
	int end;
	
	Interval(){
		this.start = 0;
		this.end = 0;
	}

	public Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}
}

public class MeetingRooms {
	
	public static void main(String[] args) {
		
		MeetingRooms a = new MeetingRooms();
		
		Interval in1 = new Interval(15, 30);
		Interval in2 = new Interval(5, 10);
		Interval in3 = new Interval(0, 30);
		
		Interval[] interval = {in1, in2, in3};
		System.out.println(a.solve(interval));
		
	}
	
	public boolean solve(Interval[] intervals ) {
		if( intervals == null ){
			return false;
		}
		
		print(intervals);
		Arrays.sort(intervals, Comp);
		print(intervals);
		return true;
	}
	
	Comparator<Interval> Comp = new Comparator<Interval>() {

		@Override
		public int compare(Interval o1, Interval o2) {
			// 오름차순
			return o1.start - o2.start;
		}
		
	};
	

	public void print( Interval[] intervals ) {
		 
		for( int i=0; i<intervals.length; i++ ) {
			Interval in = intervals[i];
			System.out.println(in.start + " " + in.end);
		}

	}
}
