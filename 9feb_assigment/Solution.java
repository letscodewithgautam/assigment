package Assigment;
import java.util.Scanner;
public class Solution {
		public static void main(String[] args) {
			 Scanner in = new Scanner(System.in);
			 System.out.print("Enter first number: ");
	         double n1 = in.nextDouble();
	         System.out.print("Enter second number: ");
	         double n2 = in.nextDouble();
	         
	         double n =  (n1/n2);
	         if (n==0 || n<=1 || n==1) {
			 System.out.println(n +" is between 0 and 1");
			 System.out.println("True");
		}
		 else  {
			 System.out.println(n +" is not between 0 and 1");
			 System.out.println("False");
	}
}
}