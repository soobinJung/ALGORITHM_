package soobin;

import java.util.*;

class Interval {

	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

public class MergeInterval {

	public static void main(String[] args) {

		Interval in1 = new Interval(2, 6);
		Interval in2 = new Interval(1, 3);
		Interval in3 = new Interval(8, 10);
		Interval in4 = new Interval(15, 18);

		List<Interval> intervals = new ArrayList<>();
		MergeInterval a = new MergeInterval();

		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);

		List<Interval> list = a.merge(intervals);

	}

	public List<Interval> merge(List<Interval> intervals) {

		if (intervals.isEmpty()) {
			return intervals;
		}

		List<Interval> result = new ArrayList<Interval>();
		System.out.print("==============정렬전\n");
		print(intervals);
		// 람다 표현식으로 오름차순
		Collections.sort(intervals, (a, b) -> a.start - b.start);
		System.out.print("==============정렬후\n");
		print(intervals);

		Interval before = intervals.get(0); // [1, 3]

		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);

			if (before.end >= current.start) {
				before.end = Math.max(before.end, current.end);
			} else {
				result.add(before);
				before = current;
			}
		}

		if (!result.contains(before)) {
			result.add(before);
		}

		System.out.print("==============\n");
		print(result);
		return result;
	}

	public void print(List<Interval> list) {

		for (int i = 0; i < list.size(); i++) {
			Interval in = list.get(i);
			System.out.println(in.start + "," + in.end);
		}
	}
}
