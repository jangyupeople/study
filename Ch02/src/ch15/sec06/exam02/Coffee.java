package ch15.sec06.exam02;

public class Coffee extends Menu{

	private String beans;

	
	public Coffee(String menu, int price,String beans) {
		super(menu, price);
		this.beans = beans;
	}


	@Override
	public void printInfo() {
		System.out.print("메뉴="+getMenu());
		System.out.print(" | 가격="+getPrice());
		System.out.println(" | 원두="+beans);
	}
}
