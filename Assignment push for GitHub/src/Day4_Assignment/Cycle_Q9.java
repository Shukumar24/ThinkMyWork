package Day4_Assignment;

public class Cycle_Q9 {
 
	public int accountNo;
	public int noOfWheels;
	
	Cycle_Q9() {
		this(123456,4);
		System.out.println("I am default constructer");
	}
	Cycle_Q9(int a,int b) {
		
		System.out.println("I am another constructer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cycle_Q9 o = new  Cycle_Q9();
		 Cycle_Q9 o1 = new  Cycle_Q9(10784596,45);
	}

}
