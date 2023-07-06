/*java.util.Collection //Collection API- ArrayList, Iterator- provides traversal,Spliterator-(Alos used for traversal) Splits the list into two and each split process parallel ,
//Comparator-(also traversal)ordering the data. Addition userdefined class is required.
//Set, list, Map.*/


import java.util.*;
class Product{
	int pid;
	String pname;
	double up;
	Product(int pid, String pname, double up){
		this.pid=pid;
		this.pname=pname;
		this.up=up;
	}

	public String toString(){
		return pid+"\t"+pname+"\t"+up;
	}
} 

class Comp implements Comparator<Product>{
	public int compare(Product p1, Product p2){
		return (String.valueOf(p1.pid)).compareTo(String.valueOf(p2.pid));
	}
}


class DDemo{
	public static void main(String args[]){
		/*ArrayList<String> al=new ArrayList<String>();
		al.add("First");
		al.add("second");
		al.add("third");

		System.out.println("2: "al+"\n"+al.size());
		//al.remove(1);  //element with the index will be removed.
		al.clear(); //->remove-all..
		System.out.println("3: "al+"\n"+al.size());*/

		ArrayList<Product> al=new ArrayList<Product>();
		al.add(new Product(120,"uyt",34.5));
		al.add(new Product(130,"syt",37.5));
		al.add(new Product(140,"vvv",39.5));
		System.out.println("before"+al);
		Collections.sort(al, new Comp());
		for(var i:al)
			System.out.println(i);
		/*System.out.println(al);
		al.remove(0);*/
		  	

		//Iterator:  
		/*Iterator<Product> itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());  //(itr.next().pname)--> displays only pnames..*/
		

		/*double amt=0; double t=0;
		for(var i:al){
			t=(i.up*2.0);
			System.out.println(i+"\t"+t);
			amt=amt+t;
		}
		System.out.println("Amount = "+amt);*/

		
	}
}

/*syntax--> 
ArrayList<User-defined/built-in class name> obj=new ArrayList<classname>(int)   //(int)--> capacity*/
