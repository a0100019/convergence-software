//2020111727 이유빈 같은 패키지-상속 클래스 4/3
package DGU_package1;

public class DGUC013_2 {

	
	public static String public접근 = "public 입니다.";
	protected static String protected접근 = "protected 입니다.";
	static String default접근 = "default 입니다.";
	private static String private접근 = "private 입니다.";
}

	class 접근제어자하위클래스 extends DGUC013_2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		접근제어자하위클래스 상속클래스=new 접근제어자하위클래스();
		System.out.println(상속클래스.public접근);
		System.out.println(상속클래스.protected접근);
		System.out.println(상속클래스.default접근);
		//System.out.println(상속클래스.private접근);
	}
	}

