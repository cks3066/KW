import java.util.Scanner;

class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	
	private int num;
	private Day[] day;
	
	MonthSchedule(int num)	{
		this.num = num;
		this.day = new Day[num];
		for(int i = 0; i < num; i++)
			day[i] = new Day();
	}
		
	public void input()	{
		System.out.print("��¥(1~30)?");
		int date = sc.nextInt();
		if(date > num || date < 1) {
			System.out.println("1~" + num +"������ ���� �Է��Ͻʽÿ�.");
			return;
		}
		if(day[date-1].get() == null) {
			System.out.print("����(��ĭ�����Է�)?");
			String newWork = sc.next();
			day[date - 1].set(newWork);
		}
		else
			System.out.println("�� ���� �̹� �ֽ��ϴ�.");
	}
	
	public void view()	{
		System.out.print("��¥(1~30)?");
		int date = sc.nextInt();
		System.out.print(date + "���� �� ���� ");
		day[date - 1 ].show();
	}
	
	public void finish()	{
		System.out.println("���α׷��� �����մϴ�.");
	}
}


class Day {
	private String work; // �Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MonthSchedule ms = new MonthSchedule(30);
	
		System.out.println("�̹��� ������ ���� ���α׷�");

		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1: ms.input(); break;
			case 2: ms.view(); break;
			case 3: ms.finish(); return;
			default: System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
			System.out.println();
		}
	}
}

