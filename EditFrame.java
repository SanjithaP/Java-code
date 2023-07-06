/*swing--> by default its multi threaded model...
	-main
	-even deligation

Menu, MenuBar, (Notepad like)..  SWing..MenuHandling

Menu types : 1) pull down  2)pop up menu
attach either menu item or action listener.

also we accelerator--> shortcuts....

*/

/*Menu Driven App
-JMenuBar
-JFrame
-JMenu
-JMenuItem
-JFileChooser --> Dialogue Box(for open, save, save as)
-JColorChooser --> to choose colour
-JOptionPane --> ok , cancel , yes , no....
*/


//PULL DOWN MENU.

/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EditFrame implements ItemListener{
	JFrame frm;
	JTextArea ta;
	JMenuBar mb;
	JMenu filemnu;
	JMenu colormnu;
	JMenuItem savemenuitm, openmenuitm;
	JCheckBoxMenuItem bcmnuitm, fcmnuitm;
	EditFrame(){
		frm=new JFrame("WORD PAD");
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new JTextArea("Enter here");
		ta.setBounds(0,0,frm.getWidth(),frm.getHeight());
		frm.add(ta);

		mb=new JMenuBar();
		frm.setJMenuBar(mb);  //used to add menu bar in frame
		filemnu=new JMenu("File");c
		mb.add(filemnu);
		mb.setBackground(Color.red);

		colormnu=new JMenu("Color");
		mb.add(colormnu);
		savemenuitm=new JMenuItem("Save");
		openmenuitm=new JMenuItem("Open");
		filemnu.add(savemenuitm);
		filemnu.add(openmenuitm);

		bcmnuitm=new JCheckBoxMenuItem("Background");
		fcmnuitm=new JCheckBoxMenuItem("ForeGround");
		colormnu.add(bcmnuitm);
		colormnu.add(fcmnuitm);
		bcmnuitm.addItemListener(this);
		fcmnuitm.addItemListener(this);
		
	}

	public void itemStateChanged(ItemEvent ie){
		if(ie.getSource()==bcmnuitm){
			if(bcmnuitm.getState())
				ta.setBackground(Color.red);
			else
				ta.setBackground(Color.white);		
		}
		else {
			if(bcmnuitm.getState())
				ta.setBackground(Color.yellow);
			else
				ta.setBackground(Color.black);
		}
		frm.repaint();
	}

	public void paint(Graphics g){
	}

	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new WordPad();
			}
		});   //thread... in SwingUtilities class we have a method invokeLater...
	}
}*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EditFrame implements Itemlistener{
	JFrame frm;
	JTextArea ta;
	JMenuBar mb;
	JMenu filemnu;
	JMenu colormnu;
	JMenuItem savemenuitm, openmenuitm;
	JCheckBoxMenuItem bcmnuitm, fcmnuitm;
	EditFrame(){
		frm=new JFrame("WORD PAD");
		frm.setVisible(true);
		frm.setSize(500,500);
		frm.setLayout(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new JTextArea("Enter here");
		ta.setBounds(0,0,frm.getWidth(),frm.getHeight());
		frm.add(ta);

		mb=new JMenuBar();
		frm.setJMenuBar(mb);  //used to add menu bar in frame
		filemnu=new JMenu("File");
		mb.add(filemnu);
		mb.setBackground(Color.red);

		colormnu=new JMenu("Color");
		mb.add(colormnu);
		savemenuitm=new JMenuItem("Save");
		openmenuitm=new JMenuItem("Open",KeyEvent.VK_O);
		openmenuitm.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
		filemnu.add(savemenuitm);
		filemnu.add(openmenuitm);
		openmenuitm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				JFileChooser jc=new JFileChooser();
				int opt=jc.showOpenDialog(frm);
				if(opt==JFileChooser.APPROVE_OPTION){
					try{
						File f=jc.getSelectedFile();
						FileInputStrem fin=new FileInputStream(f);
						byte d[]=new byte[(int)f.length()];
						fin.read(d);
						ta.setText(new String(d));
						frm.getContentPane().repaint();
					}catch(Exception e){
						ta.setText("Caught..."+e);
					}
				}
			}
		});

		savemenuitm.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				JFileChooser jc=new JFileChooser();
				int opt=jc.showSaveDialog(frm);
				if(opt==JFileChooser.APPROVE_OPTION){
					try{
						File f=jc.getSelectedFile();
						FileOutputStrem fout=new FileOutputStream(f);
						byte d[]=new byte[(int)f.length()];
						fout.write(d);
						ta.setText(new String(d));
						frm.getContentPane().repaint();
					}catch(Exception e){
						ta.setText("Caught..."+e);
					}
				}
			}
		});

		bcmnuitm=new JCheckBoxMenuItem("Background");
		fcmnuitm=new JCheckBoxMenuItem("ForeGround");
		colormnu.add(bcmnuitm);
		colormnu.add(fcmnuitm);
		bcmnuitm.addItemListener(this);
		fcmnuitm.addItemListener(this);
		
	}
	bcmnuitm.add.ItemListener(new ItmeListener(){
		public void itemStateChanged(ItemEvent ie){
			//Color c= JColorChooser.show
				ta.setBackground(Color.red);
					
			}

	
		});   
		
	
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new WordPad();
			}
		});   //thread... in SwingUtilities class we have a method invokeLater...
	}
}