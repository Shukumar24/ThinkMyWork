package Day3_Assignment;

public class Account {
   public int id;
   public String name;
   public long ac_no;
   public String address;
   public  long balance;
   
	
	public void insert(int a, String b, long c, String d,long e) {
		id=a; 
		name=b; 
		ac_no=c;
		address=d;
		balance =e;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(ac_no);
		System.out.println(address);
		System.out.println(balance);
		
        
	}
	
	public void deposite(int a) {
		balance =balance+a;
		System.out.println(balance);
	}
	
	public void withdraw(int a) {
		balance= balance-a;
		System.out.println(balance);

	}
	

	public void check_balance() {
		balance=balance;
		System.out.println(balance);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Account o1 = new Account();
  o1.insert(10,"sanju",14522122 , "Hadapsar",5000);
  //o1.display();
  o1.deposite(4000);
  o1.withdraw(300);
  o1.check_balance();
  
	}

}
