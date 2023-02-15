package com.cognizant.shapes;
class calculateArea{
	int length;
	int breath;
	int Area;
	
	calculateArea(int l,int b){
	length=l;
	breath=b;
		
	}
	void Area(){
		Area=length*breath;
		System.out.println("Area of rectangle :"+Area);
	}
	}
public class AreaCalculator {
	public static void main(String[] args) {
		calculateArea m=new calculateArea(3,4);
		m.Area();
	}


}
