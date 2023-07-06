//Adapter class and Inner class--> Dummy definition for all the methods in the interface. no adapters for theree classes 1.ActionListener  2.
//WIDOW EVENT.. FRAME.. PANEL... WINDOWLISTENER... WINDOWADAPTER..

/*import java.awt.*;
import java.awt.event.*;
class Demo_Frame extends Frame implements WindowListener{
	Demo_Frame(){
		setVisible(true);
		setSize(500,500);
		setTitle("FrameDemo");
		addWindowListener(this);
	}

	public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
	public void windowClosed(WindowEvent we){}
	public void windowIonified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}

	public static void main(String args[]){
		Demo_Frame df=new Demo_Frame();
	}

}*/

import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame implements WindowListener{
	FrameDemo(){
		setVisible(true);
		setSize(500,500);
		setTitle("FrameDemo");
		addWindowListener(new MyWindowAdapter(this));
	}

	public static void main(String args[]){
		FrameDemo df=new FrameDemo();
	}
}

class MyWindowAdapter extends WindowAdapter{
	FrameDemo fr;
	MyWindowAdapter(FrameDemo fr){
		this.fr=fr;
	}

	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}