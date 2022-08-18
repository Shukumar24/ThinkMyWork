package Day5_Assignment;

//  Questiom number 8 Day 5 video session
public class Kid_Poly {

	String bookname;
	String bookColor;
	int numberOfPage;
	
	public void readBook(String a,String b) {
		bookname=a;
		bookColor= b;
		System.out.println("first method");
	}
	
	public void readBook(String c, int d) {
		bookname=c;
		numberOfPage=d;
		System.out.println("Second method");
	}
}
