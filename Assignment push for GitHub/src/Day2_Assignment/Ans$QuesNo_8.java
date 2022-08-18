package Day2_Assignment;
import java.util.Scanner;
public class Ans$QuesNo_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number in Digit");
    int no= sc.nextInt();
    int t=no;
    int fact=1;
    int sum=0;
    while(t>0) {
    	int rem=t%10;
    	for(int i=no; i>1; i--) {fact=fact*i;}
    	sum= sum*fact;
          t=t/10;
    }
    if(sum==no) {System.out.println("number is Krishnamurthy ="+no);}
    else {System.out.println("number is not Krishnamurthy ="+ no);}
	}
}
