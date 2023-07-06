/*swing--> by default its multi threaded model...
	-main
	-even deligation

Menu, MenuBar, (Notepad like)..  SWing..MenuHandling

Menu types : 1) pull down  2)pop up menu
attach either menu item or action listener.

also we accelerator--> shortcuts....

*/

//PULL DOWN MENU.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WordPad{
	JFrame frm;
	JTextArea ta;
	JMenuBar mb;
	WordPad(){
		frm=new JFrame("WORD PAD");
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new JTextArea("Enter here");
		ta.setBounds(0,0,frm.getWidth(),frm.getHeight());
		frm.add(ta);
		mb=new JMenuBar();
		frm.setJMenuBar(mb);
		mb.setBackground(Color.red);
		frm.add(mb);
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new WordPad();
			}
		});   //thread... in SwingUtilities class we have a method invokeLater...
	}
}