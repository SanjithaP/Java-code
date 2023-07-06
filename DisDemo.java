import java.util.Scanner;
class Distance{
	double feet;
	double inches;
	
	Distance(){
		feet=0;
		inches=0;
	}

	Distance(double f, double i){
		feet=f;
		inches=i;
	}

	void getdata(){
	System.out.println("Feet = ");
	Scanner scan=new Scanner(System.in);
	feet=scan.nextInt();
	System.out.println("Inches = ");
	Scanner in=new Scanner(System.in);
	inches=in.nextInt();
	}

	void average(){
		double average=0;
		double a[];
		double sum;
		for(int i=0;i<=10;i++)
		{
		 	sum=sum+a[i];
			average=sum/10;
			System.out.println(average);
		}
	}
}

class DisDemo{
	public static void main(String args[]){
		Distance d=new Distance();
		double a[];
		for(int i=1;i<=10;i++)
		{
			Scanner in=new Scanner(System.in);
			d.a[i]=in.nextInt;
		}
		d.average();
	}
}

