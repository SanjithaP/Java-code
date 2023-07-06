/* JAVA I/O PACKAGE--> java.io package

java.io package

================
input-Output devices

Stream- Abstraction of input and Output
==================
*byte-oriented Stream (11001100 is a 8 bit data.)
*Character-Oriented unicode

inputStream(gets data in bytes) ==> Reader(converts data into unicode characters)

byte-oriented Stream: InputStream
			    OutputStream

Character-Oriented unicode: Reader(i/p)
                            Writer(o/p)


InputStream : 
=>BufferedInputStream |
=>FileInputStream     |=> Derived classes from Inputstream class.
=>ObjectInputStream   |
=>DataInputStream     |
*/

//InputStream....OutputStream

/*import java.io.*;
class Test1{
	public static void main(String args[])throws IOException{
	//read data from console
	Inputstream in=System.in;
	byte data[]=new byte[10];
	in.read(data);
	in.close();

	OutputStream out=System.out;
	out.write(data);
	out.close();
	}
}*/

/*import java.io.*;
class Test1{
	public static void main(String args[])throws IOException{
	//read data from console
	Reader in=new InputStreamReader(System.in);
	char data[]=new char[10];
	in.read(data);
	in.close();

	Writer out=new OutputStreamWriter(System.out);
	out.write(data);
	out.close();
	}
}*/

/*import java.io.*;
class Test1{
	public static void main(String args[])throws IOException{
		DataInputStream din=new DataInputstream(System.in);
		System.out.println("Enter float...");
		int a=din.readInt();
		System.out.println("Enter float...");
		float b=din.readFloat();
		din.close();
	
	}
}*/


/*import java.io.*;
class Test1{
	public static void main(String args[])throws IOException{
		DataInputStream din=new DataInputStream(System.in);
		int a=din.readInt();
		float b=din.readFloat();
		din.close();


		DataOutputStream dout=new DataOutputStream(System.out);
		dout.writeInt(a);
		dout.writeFloat(b);
		dout.close();
	
	}
}*/


import java.io.*;
class Test1{
	public static void main(String args[])throws IOException{
		BufferedInputStream din=new BufferedInputStream(System.in);
		byte[] data=new byte[100];
		bin.read(data);

		system.out.println(new String(data));
	}
}






	
	

	









