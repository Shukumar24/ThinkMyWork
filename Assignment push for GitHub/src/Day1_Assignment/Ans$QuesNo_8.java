package Day1_Assignment;
import java.util.Scanner;
public class Ans$QuesNo_8 {
public static void main(String[] args) {
		
  Scanner sc = new Scanner(System.in);
  System.out.println("enter day in digit ");
   int day = sc.nextInt();
   
   int year=day/365;
      day=day%365;
      
      int month=day/12;
      day=day%12;
      
      int week=day/7;
      day=day%7;
      
      int day1= day/1;
      day=day%1;
      
      System.out.println("year is ="+ year);
      System.out.println("moth is ="+ month);
      System.out.println("week is ="+ week);
      System.out.println("day is ="+ day1);
      }}