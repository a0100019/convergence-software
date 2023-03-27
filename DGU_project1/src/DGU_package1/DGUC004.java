//2020111727 이유빈 else if로 성적 프로그램 만들기 3/20
package DGU_package1;

import java.util.Scanner;

public class DGUC004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("student number : ");
		int stnum=sc.nextInt();
		int[] starray = new int[stnum];
		System.out.println("student grade");
		for(int i = 0; i<stnum; i++) {
			System.out.printf("student%d : ", i);
			starray[i]=sc.nextInt();
			if(starray[i]<=60) {
				System.out.printf("student%d : F\n", i);
			}else if(starray[i]<65){
				System.out.printf("student%d : D\n", i);
			}else if(starray[i]<70){
				System.out.printf("student%d : D+\n", i);
			}else if(starray[i]<75){
				System.out.printf("student%d : C\n", i);
			}else if(starray[i]<80){
				System.out.printf("student%d : C+\n", i);
			}else if(starray[i]<85){
				System.out.printf("student%d : B\n", i);
			}else if(starray[i]<90){
				System.out.printf("student%d : B+\n", i);
			}else if(starray[i]<95){
				System.out.printf("student%d : A\n", i);
			}else if(starray[i]<=100){
				System.out.printf("student%d : A+\n", i);
			}else {
				System.out.println("점수을 잘못 입력하였습니다.");
			}
		}
		
	}
}