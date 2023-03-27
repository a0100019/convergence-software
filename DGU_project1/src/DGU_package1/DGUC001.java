package DGU_package1;

/*3월13일 1번 2020111727 이유빈 식품생명공학과 4학년	
성적관리 프로그램을 만들어 보았습니다. 성적입력 전체성적보기 성적삭제 기능이 있습니다. 원하는 기능의 인덱스를 적으면 기능이 실행됩니다.*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DGUC001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		
		ArrayList<String> studentname = new ArrayList<>();
		ArrayList<Integer> studentnumber = new ArrayList<>();
		ArrayList<Integer> studentgrade = new ArrayList<>();
		studentname.add("이유빈"); studentnumber.add(2020111727); studentgrade.add(100); //셈플 성적들
		studentname.add("홍길동"); studentnumber.add(2018000111); studentgrade.add(94);
		studentname.add("김철수"); studentnumber.add(2020202020); studentgrade.add(40);
		System.out.println("---------------------성적 관리 프로그램 입니다---------------------");
	while(true) {
		System.out.println("원하는 기능의 번호를 입력하세요 1.성적입력 2.전체성적보기 3.성적삭제 4.프로그램종료");
		System.out.print("원하는 기능 번호 : ");
		int system=sc.nextInt();
		if(system==1) { //성적 입력 코드
			System.out.print("이름 학번 성적 순으로 입력하세요.\n -->");
			studentname.add(sc.next());
			studentnumber.add(sc.nextInt());
			studentgrade.add(sc.nextInt());
			System.out.println("입력되었습니다.");
		} else if(system==2) { //전체성적 보는 코드
			for(int i = 0; i<studentname.size();i++) {
				String studentlevel;
					if(studentgrade.get(i)<=60) {
						studentlevel = "F";
					}else if(studentgrade.get(i)<65){
						studentlevel = "D";
					}else if(studentgrade.get(i)<70){
						studentlevel = "D+";
					}else if(studentgrade.get(i)<75){
						studentlevel = "C";
					}else if(studentgrade.get(i)<80){
						studentlevel = "C+";
					}else if(studentgrade.get(i)<85){
						studentlevel = "B";
					}else if(studentgrade.get(i)<90){
						studentlevel = "B+";
					}else if(studentgrade.get(i)<95){
						studentlevel = "A";
					}else{
						studentlevel = "A+";
					}
				System.out.printf("%s %d %d %s\n", studentname.get(i), studentnumber.get(i), studentgrade.get(i), studentlevel);
			}
		} else if(system==3) { //성적 삭제 코드
			System.out.print("삭제할 학생의 이름을 입력하세요 : ");
			String deletename = sc.next();
			int deleteindex = studentname.indexOf(deletename);
			System.out.printf("%s님의 데이터가 삭제되었습니다.\n",studentname.get(deleteindex));
			studentname.remove(deleteindex);studentnumber.remove(deleteindex);studentgrade.remove(deleteindex);		
		} else if(system==4) {
			System.out.println("---------------------이용해 주셔서 감사합니다---------------------");
			break;
		}
		
		
	}
}
}
