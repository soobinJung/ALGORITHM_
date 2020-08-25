package soobin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Interval3 {

	int start;
	int end;

	Interval3() {
		start = 0;
		end = 0;
	}

	Interval3(int s, int e) {
		start = s;
		end = e;
	}
}

public class MeetingRoom2b {

	public static void main(String[] args) {

		MeetingRoom2b m = new MeetingRoom2b();
		Scanner sc = new Scanner(System.in);
		int check;

		do {

			System.out.print("\n start: ");
			int start = sc.nextInt();

			System.out.print("\n end  : ");
			int end = sc.nextInt();

			Interval3 in1 = new Interval3(start, end);

			check = m.solve(in1);

		} while (check == 1);
	}

	public int solve(Interval3 interval) {

		Scanner sc = new Scanner(System.in);
		int iNum = 0;
		
		if (list.isEmpty()) {
			System.out.println("xxx");
			list.add(interval);
			System.out.println("첫번째 미팅룸이 예약되었습니다");
			return 1;
		}

		// 받은 interval 을 추가한다
		list.add(interval);
		// 오름차순으로 정렬한다 start 기준
		list.sort(Comp);

		for( int i=0; i<list.size(); i++) {
			if(list.get(i)==interval) {
				iNum = i;
				System.out.println(i + "번째에 저장되었어******");
				break;
			}
		}
		
		int s = list.size();

		for (int i = 0; i < s; i++) {
			System.out.println(" [ " + i + "] " + list.get(i).start + " ~ " + list.get(i).end);
		}

		for (int i = 0; i < s; i++) {

			System.out.println(list.get(i).end + " > " + interval.start);
			// 나랑 같은 애는 체크 하지마
			if( i == iNum ) {
				continue;
			}
			
			if (list.get(i).end > interval.start) {

				total++;

				System.out.println("원하는 시간대에 사용하는 미팅룸이 있어서 새로운 미팅룸을 추가합니다.");
				System.out.println("현재 사용중인 미팅룸은 " + total + "번쨰 미팅룸 입니다");
				return 1;

			} else {
				System.out.println("중복되는 미팅룸이 없습니다.");
			}
		}



		return 1;
	}

	List<Interval3> list = new ArrayList<>();
	Queue<Interval3> heap = new PriorityQueue<Interval3>();
	int total = 0;

	Comparator<Interval3> Comp = new Comparator<Interval3>() {

		@Override
		public int compare(Interval3 o1, Interval3 o2) {
			return o1.start - o2.start;
		}
	};

}