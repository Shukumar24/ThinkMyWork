package Day1_Assignment;
import java.util.Scanner;
public class Ans$QuesNo_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your principlr - P");
		double p = sc.nextDouble();
	
		System.out.println("Enter your time or duration - T");
		double t = sc.nextDouble();
		
		System.out.println("Enter your rate of intrest - R");
		double r = sc.nextDouble();
		
		double SI =(p*t*r)/100.0;
		System.out.println("your simple intrest is ="+ SI);
	}

}
