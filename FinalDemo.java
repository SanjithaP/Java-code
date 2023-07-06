/*create a class called box with 3 data-members width height depth overridden tosrting function to display with height and depth. Create a class called boxweight with a datamember weight 
and overridden tostring function to display width height and depth.Create a class called shipment inherited from boxweight with data-member caste with overridden tostring function to 
display width weight depth cost.*/

import java.util.Scanner;
class Box{
	int width,height,depth;
	public String toString(){
		return "width"+width+height+depth;

	}
}

class BoxWeight extends Box{
	int weight;
	public String toString(){
		return "width"+width+height+depth+weight;
	}
}

class Shipment extends BoxWeight{
	int cost;
	public String toString(){
		return "width="+width+height+depth+weight+cost;
	}
}

class FinalDemo{
	static Box getObj(int which){      //to get object
		switch(which)
 		{
			case 1:
			{
				return new Box();
				//break;
			}
			case 2: 
			{
				return new BoxWeight();
				//break;
			}
			default: 
			{
				return new Shipment();
				//break;
			}
		}
	}

	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int ch=in.nextInt();
		var obj=getObj(ch);
		System.out.println(obj);
	}
}
