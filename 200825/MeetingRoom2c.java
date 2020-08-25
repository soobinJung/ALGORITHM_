package soobin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Interval4 {

	int start;
	int end;

	Interval4() {
		start = 0;
		end = 0;
	}

	Interval4(int s, int e) {
		start = s;
		end = e;
	}
}

public class MeetingRoom2c {

	public static void main(String[] args) {

		MeetingRoom2c m = new MeetingRoom2c();
		Scanner sc = new Scanner(System.in);
		int check;

		do {

			System.out.print("\n start: ");
			int start = sc.nextInt();

			System.out.print(" end  : ");
			int end = sc.nextInt();

			Interval4 in1 = new Interval4(start, end);

			check = m.solve(in1);

		} while (check == 1);
	}

	public int solve(Interval4 interval) {

		Scanner sc = new Scanner(System.in);
		int iNum = 0;

		if (list.isEmpty()) {
			
			list.add(interval);
			System.out.println("ù��° ���÷��� ����Ǿ����ϴ�");
			return 1;
		}

		// ���� interval �� �߰��Ѵ�
		list.add(interval);
		// ������������ �����Ѵ� start ����
		list.sort(Comp);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == interval) {
				iNum = i;
				break;
			}
		}

		int s = list.size();

		for (int i = 0; i < s; i++) {
			System.out.println(" [ " + i + "] " + list.get(i).start + " ~ " + list.get(i).end);
		}

		int bNum = iNum - 1;
		int aNum = iNum + 1;

		if (s == aNum) {
			
			if (list.get(bNum).end > interval.start) {
				System.out.println(list.get(bNum).end +">"+ interval.start);
				print(1);
				return 1;
			}
		} else if (-1 == bNum) {
			
			if (list.get(aNum).start < interval.end) {
				System.out.println(list.get(aNum).start +"<"+ interval.end);
				print(1);
				return 1;
			}
		} else if (list.get(bNum).end > interval.start || list.get(aNum).start < interval.end) {
			System.out.print(list.get(bNum).end +">"+ interval.start +"||");
			System.out.println(list.get(aNum).start +"<"+ interval.end);
			print(1);
			return 1;

		}

		for (int i = 0; i < list.size(); i++) {
			if ( i == iNum && i < list.size() ) {
				continue;
			}
			if (list.get(i).end > interval.start) {
				print(1);
				return 1;
			}
		}
		
		print(0);
		return 1;
	}

	public void print(int i) {
		
		if (i == 1) {
			System.out.println("���ϴ� �ð��뿡 ����ϴ� ���÷��� �־ ���ο� ���÷��� �߰��մϴ�.");
			System.out.println("���� ���÷� :" + ++total);
		} else {
			System.out.println("�ߺ��Ǵ� ���÷��� �����ϴ�.");
		}
	}

	List<Interval4> list = new ArrayList<>();
	Queue<Interval4> heap = new PriorityQueue<Interval4>();
	int total = 0;

	Comparator<Interval4> Comp = new Comparator<Interval4>() {

		@Override
		public int compare(Interval4 o1, Interval4 o2) {
			return o1.start - o2.start;
		}
	};

}