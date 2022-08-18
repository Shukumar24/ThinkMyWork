package Day5_Assignment;

public class  Square_Q6  extends Rectangle{

	public Square_Q6(){
		 super(10,10);
		
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Square_Q6 obj = new  Square_Q6();
		 System.out.println(obj);
		 obj.printTheArea();
		 obj.perimeterOfTheRectangle();
		
	}

}


// parent class below

class Rectangle {
	public int length;
	public int breath;
	
	public void printTheArea() {
		System.out.println("Print the area");
	}
	
	public void perimeterOfTheRectangle() {
		System.out.println("Print the  perimeter Of The Rectangle ");

	}

	public Rectangle(int length, int breath) {
	
		this.length = length;
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Length=" + length + ", Breath=" + breath ;
	}
	
	
}