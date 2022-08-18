package Day5_Assignment;

// Question number 8 Day 5th video session

public class BigKid extends Kid_Poly {
	public void readBook(String a,String b) {
		bookname=a;
		bookColor= b;
		System.out.println("first method bigkid");
	}
	
	public void readBook(String c, int d) {
		bookname=c;
		numberOfPage=d;
		System.out.println("second method bigkid");

	}
	public void bigKid() {}
	
}
