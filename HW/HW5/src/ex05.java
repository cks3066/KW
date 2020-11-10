class ExId{
	private static int counter = 0;
	private static int step = 1;
	private int id;
	
	public ExId() {
		counter += step;
		id = counter;
	}
	
	public int getId() { return id; }
	public static int getStep() { return step; }
	public static void setStep(int s) { step = s; }
	public static int getMaxId() { return counter; }
	
}
public class ex05 {

	public static void main(String[] args) {
		ExId a = new ExId();
		ExId b = new ExId();
		ExId.setStep(3);
		ExId c = new ExId();
		ExId d = new ExId();
		
		System.out.println("a�� �ĺ� ��ȣ : " + a.getId());
		System.out.println("b�� �ĺ� ��ȣ : " + b.getId());
		System.out.println("c�� �ĺ� ��ȣ : " + c.getId());
		System.out.println("d�� �ĺ� ��ȣ : " + d.getId());
		ExId.setStep(1);
		int max = ExId.getMaxId();
		System.out.println("������ �ο��� �ĺ� ��ȣ : " + max);
		System.out.println("������ �ο��� �ĺ� ��ȣ : " + (max+ExId.getStep()));
		
	}

}
