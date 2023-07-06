import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Basic{
	JFrame frm;
	JButton b1;
	JTextField t1,t2;
	JTextArea ta;

	Basic(){
		frm=new JFrame();
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1=new JButton("Press");
		frm.add(b1);
		b1.setBounds(50,200,100,50);
		t1=new JTextField(30);
		frm.add(t1);
		t1.setBounds(50,50,100,50);
		t2=new JTextField(30);
		frm.add(t2);
		t2.setBounds(50,100,100,50);
		ta=new JTextArea();
		frm.add(ta);
		ta.setBounds(50,300,100,100);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			String s1=t1.getText();
			String s2=t2.getText();
			ta.setText(s1+"\n"+s2);
		
		}	
		});
		
	}
	
	

	public static void main(String args[]){
		new Basic();
	}
}