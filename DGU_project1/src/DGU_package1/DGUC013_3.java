//2020111727 이유빈 같은 패키지-다른 클래스 4/3
package DGU_package1;

public class DGUC013_3 {

	public static String public접근 = "public 입니다.";
	protected static String protected접근 = "protected 입니다.";
	static String default접근 = "default 입니다.";
	private static String private접근 = "private 입니다.";
	
}

class 접근제에어자다른클래스{
	public static void main(String[] args) {
		DGUC013_3 sd = new DGUC013_3();
		System.out.println(sd.public접근);
		System.out.println(sd.protected접근);
		System.out.println(sd.default접근);
		//System.out.println(sd.private접근);
		
	}
}
