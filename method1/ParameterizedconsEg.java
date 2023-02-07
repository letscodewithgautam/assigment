package methods;

public class ParameterizedconsEg {
	int marks;
	String name;
	// parameterized cons where we have to pass the parameter
	ParameterizedconsEg(int a, String n) {
			marks=a;
	        name=n;
	}
	void show() {
		System.out.println(marks+ " " +name);
	}
	public static void main(String[] args) {
		ParameterizedconsEg d=new ParameterizedconsEg(44, "gautam");
		ParameterizedconsEg d1=new ParameterizedconsEg(41, "gourav");
		ParameterizedconsEg d2=new ParameterizedconsEg(23, "sourav");
		ParameterizedconsEg d3=new ParameterizedconsEg(28, "manish");
		ParameterizedconsEg d4=new ParameterizedconsEg(37, "pavnesh");
				
				d.show();
				d1.show();
				d2.show();
				d3.show();
				d4.show();
	}
}
