//2020111727 이유빈 switch case 3/20
package DGU_package1;

import java.util.Scanner;

public class DGUC005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 : ");
		
		int stnum=sc.nextInt();
		int[] starray = new int[stnum];
		int[] stiarray=new int[stnum];
		String[] stnarray=new String[stnum];
		System.out.println("학번 이름 성적 순으로 입력하세요.");
		for(int i = 0; i<stnum; i++) {
			System.out.printf("student%d : ", i);
			stiarray[i]=sc.nextInt();
			stnarray[i]=sc.next();
			starray[i]=sc.nextInt();
			switch(starray[i]/5) {
			case 19, 20:
				System.out.printf("%d %s : A+\n", stiarray[i], stnarray[i]);
				break;
			case 18:
				System.out.printf("%d %s : A\n", stiarray[i], stnarray[i]);
				break;
			case 17:
				System.out.printf("%d %s : B+\n", stiarray[i], stnarray[i]);
				break;
			case 16:
				System.out.printf("%d %s : B\n", stiarray[i], stnarray[i]);
				break;
			case 15:
				System.out.printf("%d %s : C+\n", stiarray[i], stnarray[i]);
				break;
			case 14:
				System.out.printf("%d %s : C\n", stiarray[i], stnarray[i]);
				break;
			case 13:
				System.out.printf("%d %s : D+\n", stiarray[i], stnarray[i]);
				break;
			case 12:
				System.out.printf("%d %s : D\n", stiarray[i], stnarray[i]);
				break;
			default:
				System.out.printf("%d %s : F\n", stiarray[i], stnarray[i]);
				break;
			
			}
		}
		
	}
}