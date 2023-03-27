package DGU_package1;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;


class studentclass {
	int q222222;
	String name;
	int number;
	int grade;
	public studentclass(String name, int number, int grade) {
		this.name = name;
		this.number = number;
		this.grade = grade;
	}
	
	public String getname() {
		return name;
	}
	
	public int getgrade() {
		return grade;
	}
	
	public int getnumber() {
		return number;
	}
	
	public String information() {
		String studentlevel;
		if(grade<=60) {
			studentlevel = "F";
		}else if(grade<65){
			studentlevel = "D";
		}else if(grade<70){
			studentlevel = "D+";
		}else if(grade<75){
			studentlevel = "C";
		}else if(grade<80){
			studentlevel = "C+";
		}else if(grade<85){
			studentlevel = "B";
		}else if(grade<90){
			studentlevel = "B+";
		}else if(grade<95){
			studentlevel = "A";
		}else{
			studentlevel = "A+";
		}
		return "이름:"+name+" 학번:"+number+" 성적:"+grade+" 학점:"+studentlevel;
	}
}

public class test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<studentclass> student = new ArrayList<>();
		
		ArrayList<String> studentname = new ArrayList<>();
		ArrayList<Integer> studentnumber = new ArrayList<>();
		ArrayList<Integer> studentgrade = new ArrayList<>();
		student.add(new studentclass("이유빈",2020111727,100));
		student.add(new studentclass("홍길동",2020123456,92));
		student.add(new studentclass("김철수",2020202020,40));
		student.add(new studentclass("임철수",202020201,76));
		student.add(new studentclass("박철수",2020202022,0));
		System.out.println(student.get(0));
		studentname.add("이유빈"); studentnumber.add(2020111727); studentgrade.add(100); //셈플 성적들
		studentname.add("홍길동"); studentnumber.add(2018000111); studentgrade.add(94);
		studentname.add("김철수"); studentnumber.add(2020202020); studentgrade.add(40);
		System.out.println("---------------------성적 관리 프로그램 입니다---------------------");
	while(true) {
		System.out.println("원하는 기능의 번호를 입력하세요 1.성적입력 2.전체성적보기 3.성적삭제 4.프로그램종료 5.원하는점수이상 보기");
		System.out.print("원하는 기능 번호 : ");
		int system=sc.nextInt();
		if(system==1) { //성적 입력 코드
			System.out.print("이름 학번 성적 순으로 입력하세요.\n -->");
			student.add(new studentclass(sc.next(),sc.nextInt(),sc.nextInt()));
			System.out.println("입력되었습니다.");
		} else if(system==2) { //전체성적 보는 코드
			for(int i = 0; i<student.size();i++) {				
				System.out.println(student.get(i).information());
			}
		} else if(system==3) { //성적 삭제 코드
			System.out.print("삭제할 학생의 이름을 입력하세요 : ");
			String deletename = sc.next();
			int deleteindex = student.indexOf(deletename);
			System.out.println(deleteindex);
			
//			System.out.printf("%s님의 데이터가 삭제되었습니다.\n",student.get(deleteindex).information());
//			studentname.remove(deleteindex);studentnumber.remove(deleteindex);studentgrade.remove(deleteindex);		
		} else if(system==4) {
			System.out.println("---------------------이용해 주셔서 감사합니다---------------------");
			break;
		} else if(system==5) {
			System.out.print("원하는 점수를 적으세요 \n-->");
			int wantscore=sc.nextInt();
			List<String> highgrade = student.stream()
				.filter(studentclass -> studentclass.getgrade() >=wantscore)
				.map(studentclass::getname)
//				.limit(5)
				.collect(Collectors.toList());
			System.out.println(highgrade);
		}
		
		
	}
}
}
