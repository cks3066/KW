class CurrencyConverter {
	private static double rate;
	
	static void setRate(double newRate) {
		rate = newRate;
	}
	static double getRate() {
		return rate;
	}
	static double toDollar(int won) {
		return (double)won / rate;
	}
	static double toKW(int dollar) {
		return dollar * rate;
	}
}
public class ex02 {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1121);
		System.out.println("ȯ��1�޷� : " + CurrencyConverter.getRate());
		System.out.println("�鸸���� $" +
		CurrencyConverter.toDollar(1000000) + "�Դϴ�.");
		System.out.println("$120�� " +
		CurrencyConverter.toKW(120) + "�� �Դϴ�.");
	}
}
