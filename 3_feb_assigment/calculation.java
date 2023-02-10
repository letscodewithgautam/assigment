package f_assigment;

public class calculation {
public static void main(String[] args) {
	
	int x1 = (101 + 0)/3;
	System.out.println("(101 + 0)/3)->"+x1);
	
	double x2 = 3.0e-6 * 10000000.1;
	System.out.println("3.0e-6*10000000.1-> "+(x2));
	
	boolean b1 = true && true;
	System.out.println("true && true -> "+ true);
	
	boolean b2 = false && true;
	System.out.println("false && true -> "+ false);
	
	boolean b3 = (false && false) || (true && true);
	System.out.println("(false && false) || (true && true) -> "+ true);
	
	boolean b4 = (false || false) && (true && true);
	System.out.println("(false || false) && (true && true) -> "+ false);
	
}
}