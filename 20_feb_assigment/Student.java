package gautam;

class college {
	int id;
	String name;
	String college;
	double fees;
	// parent class cons
	college( int id, String name, String college, double fees){
		this.id = id;
		this.name = name;
		this.college = college;
		this.fees = fees;
	}
}
class College_Batch extends college{
	long phone_no;  //child class property
	College_Batch(int id, String name, String college, double fess, long phone_no){
		super(id, name, college, fess);
		this.phone_no = phone_no;
	}
	void show() {
		System.out.println(id +" "+ name +"  "+ college +" "+ fees +" "+ phone_no);
	}
}
public class Student{
	public static void main(String[] args) {
		College_Batch obj = new College_Batch(9009, "gautam", "NIET", 1500, 12345);
		obj.show();
	}
}

