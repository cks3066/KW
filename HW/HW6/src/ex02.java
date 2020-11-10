import java.util.Scanner;

class Dictionary {
 private static String[] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
 private static String[] eng = { "love", "baby", "money", "future", "hope" };
 
 public static String kor2Eng(String word) {
	    String tmp = word + "�� �߰��� �� �����ϴ�.";
	    for(int i = 0; i < kor.length; i++) {
	       if(word.equals(kor[i])) {
	          return word + "�� " + eng[i];
	       }
	    }
	    return tmp;
 }
 
 public void search()
 {
	 Scanner sc = new Scanner(System.in);

	 System.out.print("�ѱ� �ܾ�?");
	 String word = sc.nextLine();
	 if(word.equals("�׸�"))
		 System.exit(0);
	 System.out.println(kor2Eng(word));
 }
}

public class ex02 {

	public static void main(String[] args) {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
		Dictionary dt = new Dictionary();
			dt.search();
		}
	}

}
