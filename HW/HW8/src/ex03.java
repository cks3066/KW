import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("x�� : ");
			int x = scan.nextInt();
			System.out.print("y�� : ");
			int y = scan.nextInt();
		
			System.out.println("x * y = " + mul(x, y));
			System.out.println("x / y = " + div(x, y));
		}
		catch(Throwable e){
			e.printStackTrace();
		}
		finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
	public static int mul(int x, int y) {
		return x*y;
	}

	public static int div(int x, int y) {
		return x/y;
	}
}