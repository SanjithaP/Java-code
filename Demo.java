//DTI-Multi level inheritance
//Type inference
//Rule1:Base class reference-derived class object

import java.util.Scanner;
class Myclass
{
	int x;
	public String toString()
	{
		return "Myclass";
	}
static class First extends Myclass
{
	int y;
	public String toString()
	{
		return "Firstclass";
	}
}
static class Second extends First
{
	int z;
	public String toString()
	{
		return "Second class";
	}
}
class Demo
{
 	static Myclass getObj(int which)//to get object
	{
		switch(which)
 		{
		case 1: return new Myclass();
		//break;
		case 2: return new First();
		//break;
		default: return new Second();
		//break;
		}
	}

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int ch=in.nextInt();
		var obj=getObj(ch);
		System.out.println("object"+obj);
	}
}
}