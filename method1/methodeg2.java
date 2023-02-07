package methods;

import java.util.Scanner;

public class methodeg2 {
	public static void main(String[] args) {
		
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		 num=sc.nextInt();
		
		findprimenumber(num);
	}
	public static void findprimenumber(int num) {
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(num+" is prime number");
		}
		else {
			System.out.println(num+" is not prime number");
		}
	}
	}


