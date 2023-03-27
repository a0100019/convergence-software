//2020111727 이유빈 객체의 치환 3/27
package DGU_package1;

public class DGUC010 {
	int radius;
	public DGUC010(int radius) {this.radius = radius;}
	public void set(int radius) {this.radius = radius;}
	public static void main(String [] args) {
		DGUC010 ob1 = new DGUC010(1);
		DGUC010 ob2 = new DGUC010(2);
		DGUC010 s;
		
		s = ob2;
		ob1 = ob2;
		System.out.println("ob1.radius=" + ob1.radius);
		System.out.println("ob2.radius=" + ob2.radius);
	}
}
