package Day5_Assignment;

public class Child_Q4 extends  Parent{

	public void view() {
		System.out.println("This is Child class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent o1 = new Parent();
		 Child_Q4 o2 = new  Child_Q4();
		 o1.display();
		 o2.view();
		 o2.display();
	}

}

class Parent{
	public void display() {
		System.out.println("This is parent class");
	}
}