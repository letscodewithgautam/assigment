package Assigment;
import java.util.Scanner;

public class face {
		public static void main(String[] args) {			
/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Type anyone from 1,2,3,4,5 : ");
		int n=sc.nextInt();
	
		 if (n ==1) {
			 System.out.println(" +''''''''''+ ");
			 }
			  else if (n ==2) { 
			 System.out.println("   [| o o |]  ");
			 }
			 else if (n ==3) {
			 System.out.println("     | ^ |    ");
			 }
			 else if (n ==4) {
			 System.out.println("    | '-' |   ");
				 }
			 else if (n ==5) {
			 System.out.println("    +-----+   ");
				 }
			 else if (n>5) {
			 System.out.println("error");
			 System.out.println("choose from 1,2,3,4,5");
			 }  
			 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		  if (n%2 ==0) {
		  System.out.println(" +''''''''''+ ");
		  System.out.println("   [| o o |]  ");
		  System.out.println("     | ^ |    ");
		  System.out.println("    | '-' |   ");
		  System.out.println("    +-----+   ");
		  }
		   else  if (n%2!=0) {
			 System.out.println("error");
		  
		}
	}
}
