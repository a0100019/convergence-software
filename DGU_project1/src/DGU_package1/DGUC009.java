//2020111727 이유빈 this()로 다른 생성자 호출 3/27
package DGU_package1;

public class DGUC009 {
String title;
String author;
void show() { System.out.println(title + " " + author); }
public DGUC009() {
this("", "");
System.out.println("생성자 호출됨");
}
public DGUC009(String title) {
this(title, "작자미상");
}
public DGUC009(String title, String author) {
this.title = title; this.author = author;
}
public static void main(String [] args) {
DGUC009 littlePrince = new DGUC009("어린왕자", "생텍쥐페리");
DGUC009 loveStory = new DGUC009("춘향전");
DGUC009 emptyBook = new DGUC009();
loveStory.show();
}
}