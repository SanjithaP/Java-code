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

//ADAPTER CLASS..

/*import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame{
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
}*/

//INNER ADAPTER CLASS...

/*import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame	{
	FrameDemo(){
		setVisible(true);
		setSize(500,500);
		setTitle("FrameDemo");
		addWindowListener(new MyWindowAdapter());
	}

	class MyWindowAdapter extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		FrameDemo df=new FrameDemo();
	}
}*/

//NAMELESS ANONYMOUS CLASS....

/*import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame	{
	FrameDemo(){
		setVisible(true);
		setSize(500,500);
		setTitle("FrameDemo");
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}

	public static void main(String args[]){
		FrameDemo df=new FrameDemo();
	}
}*/


//TEXT EDITING CONTROL...

/*
Compiled from "KeyListener.java"
public interface java.awt.event.KeyListener extends java.util.EventListener {
  public abstract void keyTyped(java.awt.event.KeyEvent);
  public abstract void keyPressed(java.awt.event.KeyEvent);
  public abstract void keyReleased(java.awt.event.KeyEvent);
}
*/

import java.awt.*;
import java.awt.event.*;
class FrameDemo extends Frame	{
	String msg;
	FrameDemo(){
		setVisible(true);
		setSize(500,500);
		setTitle("FrameDemo");
		//setFont(new Font("Arial",Font.BOLD,50));  //to print "sastra"..
		setForeground(Color.red);
		msg=" ";
		addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent ke){
				msg+=ke.getKeyChar();
				repaint();
			}
		}); // to type our own text...

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}

	public void paint(Graphics g){
		g.drawString(msg,50,50);
	}

	public static void main(String args[]){
		FrameDemo df=new FrameDemo();
	}
}



