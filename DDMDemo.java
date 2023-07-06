/*Dynamic Method Dispatch (runtime polymorphism) and Abstract 
- Rule : Base class datatype --> Derived class object.
- for Abstract , the class/function is preceeded with the keyword abstract.
- we cannot create an object for abstract class.*/



import java.util.Scanner;
class Shape{
	double dim1,dim2;
	Shape(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}

	void area(){}
}

class Rectangle extends Shape{
	Rectangle(double l,double b){
		super(l,b);
	}

	void area(){
		System.out.println("Area of rectangle = "+(dim1*dim2));
	}
}

class Triangle extends Shape{
	Triangle(double b,double h){
		super(b,h);
	}

	void area(){
		System.out.println("Area of triangle = "+(dim1*dim2/2.0));
	}
}

class DDMDemo{
	public static void main(String args[]){
		Shape s;   //reference
		Rectangle r=new Rectangle(23.4,78.6);
		Triangle t=new Triangle(34.6,67.8);
		//r.area();
		//t.area();    //static polymorphism(compile time)
		Scanner in=new Scanner(System.in);
		int ch=in.nextInt();
		if(ch==1)
			s=r;    //area of rectangle. s=new Rectangle(23.4,78.6)
		else
			s=t;    //area of triangle.  s=new Triangle(34.6,67.8)
		s.area();     //two different behaviour(Dynamic polymorphism-runtime polymorphism)
	}
}
	
/*if Shape is abstract class, we cannot create Shape s=new Shape()[not allowed].*/
