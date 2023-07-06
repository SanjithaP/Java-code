class Distance{
int feet;
int inches;

Distance(){
feet=0;
inches=0;
}

Distance(int f,int i){
feet=f;
inches=i;
}

void addDistance(Distance d2){
feet=feet+d2.feet;
inches=inches+d2.inches;
if(inches>12)
{
inches=inches-12;
feet+=1;
}
System.out.println("Result : "+feet+" feet  "+inches+" inches");
}

}

class DistanceDemo{
public static void main(String args[]){
Distance d1=new Distance(5,9);
Distance d2=new Distance(5,2);
Distance d3=new Distance();
d1.addDistance(d2);
}
}
