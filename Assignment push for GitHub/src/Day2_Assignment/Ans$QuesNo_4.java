package Day2_Assignment;
import java.util.Scanner;
public class Ans$QuesNo_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter your basic sallery");
  int basic = sc.nextInt();
  
  int hra=basic*35/100;
     int da = basic*25/100;
     
     double gross =basic+ hra+da;
     if(gross>=80000) {System.out.println("position is VP");}
     else if(gross>=60000) {System.out.println("position is AVP");}
     else if(gross>=40000) {System.out.println("position is Manager");}
     else if(gross>=0) {System.out.println("post is A Manager");}
     else {System.out.println("invalid sallery");}
      }}
