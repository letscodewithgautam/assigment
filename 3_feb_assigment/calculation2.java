package f_assigment;
import java.util.Scanner;
public class calculation2 {
		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			
			System.out.print("Enter number of minute : ");
			int min;
			min=sc.nextInt();
			int year,days,months;
			int yr=60*24*365; //logic for minutes in year
			year=min/yr; // for year 
			System.out.println("Number of years : "+year);
			
			int m = 60*24*30;
			months=min/m;
			System.out.println("Number of months : "+months);
			// logic for number of as days 
			min=min-(year*yr);
			int day=60*24;
			days=min/day;
			System.out.print("Number of days : "+days);
		}

	}

