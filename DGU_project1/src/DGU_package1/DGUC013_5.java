//2020111727 이유빈 다른 패키지-클래스 접근 4/3
package DGU_package1;

import DGU_package2.DGUC013_4_2;

public class DGUC013_5 extends DGUC013_4_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DGUC013_5 접근제어자다른패키지클래스 = new DGUC013_5();
		
		System.out.println(접근제어자다른패키지클래스.public접근);
		System.out.println(접근제어자다른패키지클래스.protected접근);
		//System.out.println(접근제어자다른패키지클래스.default접근);
		//System.out.println(접근제어자다른패키지클래스.private접근);
	}

}
