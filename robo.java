class robo
{
public static void main(String args[])
{
int x=10;
int y=2;
int z;
try
{
z=(x/y);
System.out.println(z);
}catch(ArithmeticException e)
{
System.out.println("invalid");
}
System.out.println("program over");
}
}


