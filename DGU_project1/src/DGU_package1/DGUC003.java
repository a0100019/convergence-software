package DGU_package1;

//3월13일 3번 2020111727 이유빈 식품생명공학과 4학년, 계산기 프로그램을 만들어 보았고 종료 기능도 만들어 보았습니다.	
import java.util.Scanner;

public class DGUC003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("계산기 프로그램입니다. ex) 3 + 2와 같이 입력하세요. \n0 + 0 을 입력하면 프로그램이 종료됩니다."
				+ "\n-->");
		
		while(true) {
			
			int firstnum = sc.nextInt();
			String sign = sc.next();
			int secondnum=sc.nextInt();
			if(firstnum == 0 && secondnum == 0) {
				System.out.println("사용해주셔서 감사합니다.");
				break;
			}
			if(sign.equals("+")) {
				int answer = firstnum+secondnum;
				System.out.println(answer);
			}
			if(sign.equals("-")) {
				int answer = firstnum-secondnum;
				System.out.println(answer);
			}
			if(sign.equals("*")) {
				int answer = firstnum*secondnum;
				System.out.println(answer);
			}
			if(sign.equals("/")) {
				double answer = (double)firstnum/(double)secondnum;
				System.out.println(answer);
			}
			if(sign.equals("^")) {
				int answer = 1;
				for(int a = 0; a<secondnum;a++) {
					answer*=firstnum;
				}
				System.out.println(answer);

			}
			System.out.print("-->");
		}
	}
}