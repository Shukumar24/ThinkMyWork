package Day5_Assignment;

  // Question number 9 Day 5 online video session......

public class Teenager extends Kid_Poly {
	public void readBook(String a,String b) {
		bookname=a;
		bookColor= b;
		System.out.println("first method teenager");

	}
	
	public void readBook(String c, int d) {
		bookname=c;
		numberOfPage=d;
		System.out.println("second method teenager");

	}
	
	public static void main(String[] args) {
		Kid_Poly k1=   new  BigKid();
		k1.readBook("Poem", 2);

		Kid_Poly k2 =  new Teenager();
		k2.readBook("math", "white");
	
		 
		 
	}
}
