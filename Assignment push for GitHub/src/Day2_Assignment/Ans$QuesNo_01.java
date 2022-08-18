package Day2_Assignment;
import java.util.Scanner;
public class Ans$QuesNo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter your first value");
     int x= sc.nextInt();
     
     System.out.println("enter your second value");
     int y= sc.nextInt();
     
     System.out.println("enter your third value");
     int z= sc.nextInt();
     
     int str = (x>y)? x>z? x:z:y>z? y:x;
     System.out.println("maximum value is ="+str);
	}}
