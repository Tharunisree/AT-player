package taruni;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
public class AT {
	public static void main(String[] args) {
		JFrame f=new JFrame("AT player");
		JButton b=new JButton("play");
		Choice c=new Choice();
		c.setBounds(80, 30, 90,80);
		c.addItem("telugu");
		c.addItem("hindi");
		c.addItem("english");
		f.add(c);
		JLabel l = new JLabel(new ImageIcon("C:\\Users\\Prasanna Chennupalli\\Desktop\\musicimage1.jfif"));
		ImageIcon icon = new ImageIcon("C:\\Users\\Prasanna Chennupalli\\Desktop\\musicimage.jfif");
		JLabel label = new JLabel(icon);
		f.add(label);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	    b.setBounds(100, 100, 80, 60); 
	    f.add(b);
	    f.add(l);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.dispose();
	    b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			f.dispose();
			//public Check() {
				JFrame f1 = new JFrame("MusicPlayer");
				Button b1=new Button("play");
				 Choice c1=new Choice();
				 c1.setBounds(50, 40, 40, 50);
				 c1.addItem("audio");
				 c1.addItem("video");
				 f1.add(c1);
				  b1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
	if(c.getSelectedItem()=="telugu"&&c1.getSelectedItem()=="video") {
	try {Desktop.getDesktop().open(new File("C:\\Users\\Prasanna Chennupalli\\Desktop\\Buttabomma.mp4"));}
	 catch (IOException e1) {
							 //TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
						if(c.getSelectedItem()=="telugu"&&c1.getSelectedItem()=="audio") {
	 try {Desktop.getDesktop().open(new File("C:\\Users\\Prasanna Chennupalli\\Desktop\\Buttabomma.mp3"));
							} catch (IOException e1) {
								 //TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						if(c.getSelectedItem()=="hindi"&&c1.getSelectedItem()=="audio") {
				try {Desktop.getDesktop().open(new File("C:\\Users\\Prasanna Chennupalli\\Desktop\\Tooteykhaab.mp3"));
							} catch (IOException e1) {
								 //TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						if(c.getSelectedItem()=="hindi"&&c1.getSelectedItem()=="video") {
							try {Desktop.getDesktop().open(new File("C:\\Users\\Prasanna Chennupalli\\Desktop\\Tooteykhaab.mp4"));
							} catch (IOException e1) {
								 //TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						if(c.getSelectedItem()=="english"&&c1.getSelectedItem()=="audio") {
							try {Desktop.getDesktop().open(new File("C:\\Users\\Prasanna Chennupalli\\Desktop\\Alone.mp3"));
							} catch (IOException e1) {
								 //TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						if(c.getSelectedItem()=="english"&&c1.getSelectedItem()=="video") {
							try {Desktop.getDesktop().open(new File("C:\\Users\\Prasanna Chennupalli\\Desktop\\Alone.mp4"));
							} catch (IOException e1) {
								 //TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
						
				});
			   
				b1.setBounds(50, 50,50, 50);
				l.add(b1);
			    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f1.setSize(300,300);
				f1.setVisible(true);
				f1.add(l);
				}
	 });
	    f.setSize(250, 300);
		f.setLayout(null);
		f.setVisible(true);
		}
	 }



