import java.util.StringTokenizer;

public class ex01 {

	public static void main(String[] args) {
		String s1 = "���ع��� ��λ��� ������ �⵵��";
		String s2 = "2020/11/03";
		String s3 = "2020��11��03��";

		StringTokenizer st1 = new StringTokenizer(s1," ");
		StringTokenizer st2 = new StringTokenizer(s2,"/");
		StringTokenizer st3 = new StringTokenizer(s3,"�����");
		
		int i = 1;
		
		System.out.println("s1 count:" + st1.countTokens());
		while(st1.hasMoreTokens())
			System.out.println(i++ + " : " + st1.nextToken());
		System.out.println();
		
		i = 1;
		
		System.out.println("s2 count:" + st2.countTokens());
		while(st2.hasMoreTokens())
			System.out.println(i++ + " : " + st2.nextToken());
		System.out.println();
		
		i = 1;
		
		System.out.println("s3 count:" + st3.countTokens());
		while(st3.hasMoreTokens())
			System.out.println(i++ + " : " + st3.nextToken());
		System.out.println();


		 }

}
