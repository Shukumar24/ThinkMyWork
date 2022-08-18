package Day2_Assignment;

public class Ans$QuesNo_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=0,b=1;
  for(int i=1; i<=20; i++) {
	  int c= a+b;
	  System.out.println("fibonacci number is ="+ c);
	  a=b;
	  b=c; 
  }
	}

}
