package Day2_Assignment;
import java.util.Scanner;
public class Ans$QuesNo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter first value");
double a= sc.nextDouble();

System.out.println("Enter second value");
double b= sc.nextDouble();

 
 System.out.println("Press 1 for Add / Press 2 for Subtract / Press 3 for Multiply / Press 4 for Divide");
 int no= sc.nextInt();
 
 switch(no) {
 case 1 : double add= a+b;
 System.out.println("add no is ="+ add);
 break;
 
 case 2 : double sub= a-b;
 System.out.println("subtract no is ="+ sub);
 break;
 
 case 3 : double mul= a*b;
 System.out.println("multiplaction no is ="+ mul);
 break;
 
 case 4 : double div= a/b;
 System.out.println("divide no is ="+ div);
 break;
 
 default:System.out.println("please enter correct key ");
 }

	}}
