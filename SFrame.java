import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

class Product{
	String  pname;
	int pid;
	int qty;

	Product(String  pname,int pid,int qty){
		this.pname=pname;
		this.pid=pid;
		this.qty=qty;
	}

void getDetails(String name,int id,int q){
pname=name;
pid=id;
qty=q;
}
}

public class SFrame extends JFrame implements ActionListener{
JLabel id,name,quantity;
JTextField t1,t2,t3;
JButton sub,det;
JTextArea txt;
public SFrame(){
setLayout(null);
id=new JLabel("Product ID");
t1=new JTextField(30);
name=new JLabel("Product Name");
t2=new JTextField(30);
quantity=new JLabel("Quantity in hand");
t3=new JTextField(30);
sub=new JButton("Submit");
det=new JButton("Details");
txt=new JTextArea();
setVisible(true);
setSize(500,500);
add(id);
add(name);
add(quantity);
add(t1);
add(t2);
add(t3);
add(sub);
add(det);
add(txt);
id.setBounds(50,100,100,50);
t1.setBounds(200,100,200,50);
name.setBounds(50,200,100,50);
t2.setBounds(200,200,200,50);
quantity.setBounds(50,300,100,50);
t3.setBounds(200,300,200,50);
sub.setBounds(50,500,80,50);
det.setBounds(200,500,80,50);
sub.addActionListener(this);
det.addActionListener(this);

}



public void actionPerformed(ActionEvent ae){
if(ae.getSource()==sub){
int i=Integer.parseInt(t1.getText());
int q=Integer.parseInt(t3.getText());
Product p1=new Product();
ArrList al;
p1.getDetails(i,t2.getText(),q);
al.add(p1);
}
else{
al.display();
}
}

public static void main(String args[]){
SFrame sf=new SFrame();
}


}

public class ArrList{
ArrayList<Product>al=new ArrayList<Product>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String name=br.readLine();
int id=Integer.parseInt(br.readLine());
int qty=Integer.parseInt(br.readLine());
Product p=new Product(name,id,qty);
al.add(p);

void display(){
for(var i:al)
System.out.println(i);
/*Iterator<Product>itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}*/
}
}
