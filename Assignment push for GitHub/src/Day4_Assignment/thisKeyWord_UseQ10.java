package Day4_Assignment;

public class thisKeyWord_UseQ10 {
	
	public int accountNo;
	public int noOfWheels;
	public String name;
	
	public void sound() {
		System.out.println("i am concret Method");
	}
	//2. constructer chaining

	thisKeyWord_UseQ10(){
		this(4554555,4);
		System.out.println("I am default Constructer");
	}
	
	//1. sadowing of instance variable
	 thisKeyWord_UseQ10(int accountNo, int noOfWheels) {
	
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
	}
	
	//3. method calling
	 thisKeyWord_UseQ10(int a, int b, String c){
		 this.sound();
		 
	 }
	
	@Override
	public String toString() {
		return "AccountNo=" + accountNo + ", NoOfWheels=" + noOfWheels;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeyWord_UseQ10  o = new thisKeyWord_UseQ10();
		System.out.println(o.toString());
		
		thisKeyWord_UseQ10  o1 = new thisKeyWord_UseQ10(125211,577884,"bbxsgssgx");
		System.out.println(o1.toString());

		
	}

	

}
