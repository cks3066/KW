class TV {
	String brand;
	int year;
	int inch;
	
	public TV(String newBrand, int newYear, int newInch)
	{
		brand = newBrand;
		year = newYear;
		inch = newInch;
	}
	
	public void show()
	{
		System.out.println(brand + "���� ����" + year + "���� " + inch + "��ġ TV");
	}
}



public class ex01 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
