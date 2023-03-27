package DGU_package1;

//3월13일 2번 2020111727 이유빈 식품생명공학과 4학년	
import java.util.Scanner;

public class DGUC002 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.print("구구단 프로그램입니다. 원하는 숫자를 적으세요. all을 적을 시 모든 단이 나오게 됩니다."
			+ "\n-->");
	String num=sc.next();	
	if(num.equals("all")) {
		for(int j = 1;j<10;j++) {
			for(int i = 1;i<10;i++) {
				System.out.printf("%d * %d = %d\n",j,i,j*i);
			}
		}
	}else {
		int numi = Integer.parseInt(num);
	for(int i = 1;i<10;i++) {
		System.out.printf("%d * %d = %d\n",numi,i,numi*i);
	}
	}
	}
}