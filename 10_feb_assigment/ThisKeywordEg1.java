package methods;

public class ThisKeywordEg1 {
	int houseno;
	String name;
	float fmember;
	static String area = "ISMAILPUR"; // static variable
	// static void change() {
	static void change() {  //Static method
		area = "BASANTPUR";
		}
	// cOllege = "ITC"
	// constructor
	
	ThisKeywordEg1( int houseno, String name, float fmember){  // parameterized constructor
		this.houseno = houseno;
		this.name = name;
		this.fmember = fmember;
	}
		void display(){
			System.out.println(houseno +" "+ name +" "+ fmember +" "+ area);
		}
		public class ThisKeywordEg{   // class2
			public static void main(String[] args) {
				// staticvariable1.change
				ThisKeywordEg1.change();
				// objects
				ThisKeywordEg1 s1 = new ThisKeywordEg1(111,"GAUTAM",5);
				ThisKeywordEg1 s2 = new ThisKeywordEg1(112,"SOURAV",6);
				ThisKeywordEg1 s3 = new ThisKeywordEg1(113,"MANISH",7);
				s1.display();  //method call
				s2.display();
				s3.display();
			}
		}
}
