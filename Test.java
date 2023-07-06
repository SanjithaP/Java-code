/*GUI - Graphical User Interface

DELEGATION EVENT MODEL=> It is a desing used by java developer to desing GUI based application.

THREE ELEMENTS=> Event(action,most of time it will be a user action.sometimes it may be build in action)[class]
                 Event source(object which allows to trigger the event)[class]
	           Event listener(When event is done what should be done i.e the logic is displayed here)[interface] */


/*import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

AWT vs Swing:
Abstract Window Toolkit*/

//GUI Sample Program:

import java.awt.*;
import java.awt.event.*;

//panel..frame..window...

public class Test extends Frame{
	int count;
	Button btnSubmit;
	Label lblStatus;
	public Test(){
		btnSubmit=new Button("Press....");
		lblStatus=new label();
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		add(btnsubmit);
		btnSubmit.setBounds(50,50,100,50);
		add(lblStatus);
		lblstatus.setBounds(100,50,100,50);
		btnSubmit.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
		lblstatus.setText(btnSubmit.getLabel()+(count++));
		repaint();
	}

	public static void main(String args[]){
		new Test();

	}
	



     
