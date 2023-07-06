//Popupmenu.... Messagebox-Shows message.... InputBox-input from user(String/Integer)......
/* 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*class FrameEdit{
	JFrame frm;
	JTextArea ta;
	JPopupMenu mnu;
	JMenuItem mnucut, mnucpy,mnupst;
	

	FrameEdit(){
		frm=new JFrame("WORD PAD");
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new JTextArea("Enter here");
		ta.setBounds(0,0,500,500);
		frm.add(ta);
		
		mnu=new JPopupMenu();
		mnucut=new JMenuItem("Cut");
		mnucpy=new JMenuItem("Copy");
		mnupst=new JMenuItem("Paste");
		mnu.add(mnucut);
		mnu.add(mnucpy);
		mnu.add(mnupst);

		mnucut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				ta.cut();
			}
		});

		mnucpy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				ta.copy();
			}
		});

		mnupst.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				ta.paste();
			}
		});

		ta.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				if(me.getButton()==MouseEvent.BUTTON3)
					mnu.show(ta,me.getX(),me.getY());
			}
		});
	}

	public static void main(String args[]){
		new FrameEdit();
	}
}*/
class InvalidMark extends Exception{
	public String toString(){
		return "Enter valid mark";
	}
}


class FrameEdit{
	JFrame frm;
	JLabel lbl;
	JTextField t;
	JButton b;

	FrameEdit(){
		frm=new JFrame("WORD PAD");
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lbl=new JLabel("Mark : ");frm.add(lbl);lbl.setBounds(50,50,100,50);
		t=new JTextField(20);frm.add(t);t.setBounds(180,50,100,50);
		JOptionPane.showMessageDialog(frm,"enter proper value");
		b=new JButton("Check");frm.add(b);
		b.setBounds(50,100,100,50);

		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try{
					int v=Integer.parseInt(t.getText());
					if(v<0 || v>100)
						throw new InvalidMark();
				}catch(Exception e){
					
				}
			}
		});

		/*t.addTextListener(new TextListener(){
			public void textValueChanged(TextEvent te){
			}
		});*/
	}

	public static void main(String args[]){
		new FrameEdit();
	}
}



		
