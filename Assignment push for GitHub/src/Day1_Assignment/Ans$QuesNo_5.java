package Day1_Assignment;
import java.util.Scanner;
public class Ans$QuesNo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter your First number");
		 double x = sc.nextDouble();
		 
		 System.out.println("enter your First number");
		 double y = sc.nextDouble();
		
		  System.out.println("enter for sum- 1 $ enter for sub- 2 $ enter for div- 3 $ enter for multi - 4");
		 int no= sc.nextInt();
		 
		 switch(no) {
		 case 1 : double sum=x+y;
		 System.out.println("sum is ="+ sum);
		 break;
		 
		 case 2 : double sub=x-y;
		 System.out.println("sub is ="+ sub);
		 break;
		 
		 case 3 : double div=x/y;
		 System.out.println("div is ="+ div);
		 break;
		 
		 case 4 : double mult=x*y;
		 System.out.println("multi is ="+ mult);
		 break;
		 
		 default : System.out.println("invalid key you are press");
		 }
		 
	}}
