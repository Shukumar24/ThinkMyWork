package Day1_Assignment;
import java.util.Scanner;
public class Ans$QuesNo_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter methamatics marks");
		int math = sc.nextInt();
		
		System.out.println("enter physics marks");
		int phys = sc.nextInt();
		
		System.out.println("enter chemistry");
		int chem = sc.nextInt();
		
		System.out.println("enter english marks");
		int eng = sc.nextInt();
		
		System.out.println("enter hindi marks");
		int hindi = sc.nextInt();
		
		int total= math+phys+chem+eng+hindi;
		int per= (total*100)/500;
		
		System.out.println("Student percentage is ="+ per+"%");
		
	}}
