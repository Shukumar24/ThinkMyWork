package Day4_Assignment;

public class Account_q1 {

	long accountNo;
	String  customerName;
	
	public Account_q1(long no, String name) {
		super();
		accountNo = no;
		customerName = name;
		System.out.println("I am in parameterized constructor");
	}

	public Account_q1() {
		accountNo=1239875644;
		customerName="Aditya Singh";
		System.out.println("I am in default constructor");
	}

	public String toString() {
		return "AccountNo=" + accountNo + ", CustomerName=" + customerName ;
	}
	
	public static void main (String[] args) {
		Account_q1 o = new Account_q1();
		System.out.println(o);
		
		Account_q1 o1 = new Account_q1();
		System.out.println(o1);
		
		Account_q1 o2 = new Account_q1(1024952494,"Sonal Singh");
		System.out.println(o2);
	}
	
}
