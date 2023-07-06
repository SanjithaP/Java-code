//Inheritance... Abstract class.
import java.util.Scanner;
abstract class Shape3D{
	/*double dim1,dim2;
	Shape3D(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}*/
	void volume(){}
}

class Sphere extends Shape3D{
	double r;
	Sphere(double r){
		this.r=r;
	}
	void volume(){
		System.out.println("Volume of sphere = "+(3.14*r*r*r*4.0/3.0));
	}
}

class Cone extends Shape3D{
	double r,h;
	Cone(double r,double h){
		this.r=r;
		this.h=h;
	}
	void volume(){
		System.out.println("Volume of Cone = "+(3.14*r*r*h/3.0));
	}
}

class Cylinder extends Shape3D{
	double r,h;
	Cylinder(double r,double h){
		this.r=r;
		this.h=h;
	}
	void volume(){
		System.out.println("Volume of Cylinder = "+(3.14*r*r*h));
	}
}

class NewDemo{
	public static void main(String args[]){
	Sphere sh=new Sphere(34.2);
	Cylinder cy=new Cylinder(34.2,23.0);
	Cone c=new Cone(34.2,14);
	//Shape s;
	Scanner in=new Scanner(System.in);
	int ch=in.nextInt();
	if(ch==1){
		//s=sh;
		sh.volume();
	}
	else if(ch==2){
		//s=cy;
		cy.volume();
	}
	else if(ch==3){
		//s=c;
		c.volume();
	}
	else
		System.out.println("Invalid input");
	}
}
		
