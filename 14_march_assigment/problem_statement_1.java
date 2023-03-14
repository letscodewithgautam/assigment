package Assigment;
//problem_statement_1
import java.util.StringTokenizer;

public class problem_statement_1 {
	public static void show() {
        String str = "welcome to java";
        str.concat("Let us learn");
        char ch = str.charAt(4); // note that the index is zero-based
        System.out.println("The character at position 5 is: " + ch);
        String b="Welcome";// second string
        int comparison= str.compareToIgnoreCase(b);
        System.out.println("comparision string:"+ comparison);
        // let us learn  to str with welcome:"+comparison)
        System.out.println(str);
     // string bw 4th and 10th pos
     		System.out.println("string bw 4th and 10th pos : "+str.substring(4, 10));
     		// lower case
     		System.out.println("Lower case string: "+str.toLowerCase());			
     		// replace a with e
     			System.out.println("After replacing a with e :"+str.replace('a', 'e'));
     		// concat	
     			str=str.concat(" Let us learn");
     			System.out.println("After concatenates  string is : "+str);	
     			System.out.println();
    }
    public static void print() {
		System.out.println("Problem Statement 2");
		System.out.println();
		
		StringBuffer s = new StringBuffer("This is StringBuffer"); 
		System.out.println("Original String : "+s);
	//	Adds the string ”- This is a sample program” to existing string and display it.
		s.append("- This is a sample program");
		System.out.println("After adding : "+s);
	//	Inserts the string “Object” into the existing string at 21st position and display it.
		s.insert(21, "Object");
		System.out.println("After inserting object at 21 pos: "+s);
	//  Replaces the word “Buffer” with “Builder” and display it.
		s.replace(14, 20, "Builder");
		System.out.println("After replacing buffer with builder : "+s);
	//  Reverses the entire string and displays it.	
		s.reverse();
		System.out.println("after reversing string : "+s);
		
		System.out.println();
	}
	public static void display() {
		System.out.println("Problem statement 3 ");
		System.out.println();
		

		StringTokenizer st = new StringTokenizer ("C:\\IBM||DB2||PROGRAM\\DB2COPY1.EXE");
		System.out.println("Original Statement : "+st);
		

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken("\\"));
		}
	}
	public static void main(String[] args) {
		show();
		print();
		display();
	}
}
