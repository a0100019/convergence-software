//2020111727 이유빈 여러 생성자 만들기 3/27
package DGU_package1;

public class DGUC008 {
	int radius;
	String name;
	int price;
	public DGUC008() {
	radius = 1; name = "";
	}
	public DGUC008(String n) { 
	radius = 1; name = n;
	}
	public DGUC008(int r, String n) { 
	radius = r; name = n;
	}
	public DGUC008(int r, String n,int price) {
	radius = r; name = n;this.price = price;
	}
	public double getArea() {
	return 3.14*radius*radius;
	}
	public static void main(String[] args) {
	DGUC008 pizza = new DGUC008(10, "자바피자"); 
	double area = pizza.getArea();
	System.out.println(pizza.name + "의 면적은 " + area);
	
	DGUC008 tomato = new DGUC008("토마토피자");
	area = tomato.getArea();
	System.out.println(tomato.name + "의 면적은 " + area);
	
	DGUC008 donut = new DGUC008();
	donut.name = "도넛피자";
	area = donut.getArea();
	System.out.println(donut.name + "의 면적은 " + area);	
	
	DGUC008 cheeze = new DGUC008(5, "치즈피자", 10000);
	area = cheeze.getArea();
	System.out.println(cheeze.name + "의 면적은 "+area +" 의 가격은 "+cheeze.price);
	}

}
