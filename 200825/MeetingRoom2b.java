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
			System.out.println("ù��° ���÷��� ����Ǿ����ϴ�");
			return 1;
		}

		// ���� interval �� �߰��Ѵ�
		list.add(interval);
		// ������������ �����Ѵ� start ����
		list.sort(Comp);

		for( int i=0; i<list.size(); i++) {
			if(list.get(i)==interval) {
				iNum = i;
				System.out.println(i + "��°�� ����Ǿ���******");
				break;
			}
		}
		
		int s = list.size();

		for (int i = 0; i < s; i++) {
			System.out.println(" [ " + i + "] " + list.get(i).start + " ~ " + list.get(i).end);
		}

		for (int i = 0; i < s; i++) {

			System.out.println(list.get(i).end + " > " + interval.start);
			// ���� ���� �ִ� üũ ������
			if( i == iNum ) {
				continue;
			}
			
			if (list.get(i).end > interval.start) {

				total++;

				System.out.println("���ϴ� �ð��뿡 ����ϴ� ���÷��� �־ ���ο� ���÷��� �߰��մϴ�.");
				System.out.println("���� ������� ���÷��� " + total + "���� ���÷� �Դϴ�");
				return 1;

			} else {
				System.out.println("�ߺ��Ǵ� ���÷��� �����ϴ�.");
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