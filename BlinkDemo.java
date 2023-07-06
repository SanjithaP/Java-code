import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class BlinkDemo{
	JFrame frm;
	JLabel lbl;
	BlinkDemo(){
		frm=new JFrame("THREAD DEMO");
		frm.setVisible(true);
		frm.setSize(600,600);
		frm.setLayout(null);
		lbl=new JLabel("SASTRA UNIVERSITY");
		frm.add(lbl);lbl.setBounds(50,50,150,100);
		lbl.setFont(new Font("Arial",Font.BOLD,20));

		Timer t=new Timer(100,new ActionListener(){
			boolean f=true;
			//int x = 0;
			public void actionPerformed(ActionEvent ae){
				if(f){
					lbl.setForeground(Color.red);f=false;
				}else{
					lbl.setForeground(frm.getBackground());f=true;
				}
			}
			lbl.setLocation(10,100);
			lbl.setLocation(20,100);
			lbl.setLocation(30,100);
			lbl.setLocation(40,100);
			//x=x+10;
		});
		t.start();//timer is built in thread.
	}

public static void main(String args[]){
		new BlinkDemo();
	}
}