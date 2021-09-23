import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class Versity extends JFrame{

	ImageIcon image1 = new ImageIcon("images/BE.png");
	ImageIcon image2 = new ImageIcon("images/Shoma.png");
	ImageIcon image3 = new ImageIcon("images/AP1.png");
	ImageIcon image4 = new ImageIcon("images/SC.png");
	ImageIcon image5 = new ImageIcon("images/abir.png");
	ImageIcon image6 = new ImageIcon("images/stat.png");
	
       JButton btnAdd = new JButton("BE");
       JButton btnAdd1 = new JButton("MATH");
       JButton btnAdd2 = new JButton("DLD");
       JButton btnAdd3 = new JButton("DM");
       JButton btnAdd4 = new JButton("JAVA");
       JButton btnAdd5 = new JButton("STAT");
       JButton btnRemove = new JButton("Remove");
       
	   Border border = BorderFactory.createRaisedSoftBevelBorder();
       JLabel label = new JLabel();
       JLabel label1 = new JLabel();
       JLabel label2 = new JLabel();
       JLabel label3 = new JLabel();
       JLabel label4 = new JLabel();
       JLabel label6 = new JLabel("Faculty Members");
      
	Versity()
	{
		init();
		action();
	}
	
    public void init()
    {
        btnAdd.setBounds(20,90,80,50);
    	btnAdd1.setBounds(110,90,80,50);
    	btnAdd2.setBounds(200,90,80,50);
    	btnAdd3.setBounds(290,90,80,50);
    	btnAdd4.setBounds(380,90,80,50);
    	btnAdd5.setBounds(470,90,80,50);
    	btnRemove.setBounds(560,90,80,50);
    	
    	label.setBounds(100, 120, 300, 250);
    	label1.setBounds(270, 200, 450, 30);
    	label2.setBounds(270, 220, 450, 30);
    	label3.setBounds(270, 240, 450, 30);
    	label4.setBounds(270, 260, 450, 30);
    	
    	label6.setBounds(200, 10, 400, 100);
    	label6.setFont(new Font("Cambria",Font.BOLD,30));
    	label.setFont(new Font("Cambria",Font.BOLD,30));
    	label1.setFont(new Font("Cambria",Font.BOLD,20));
    	label2.setFont(new Font("Cambria",Font.BOLD,20));
    	label3.setFont(new Font("Cambria",Font.BOLD,20));
    	label4.setFont(new Font("Cambria",Font.BOLD,20));
    	
    	setSize(700,700);
    	setVisible(true);
    	setLocationRelativeTo(null);
    	//setResizable(false);
    	setTitle("Teachers");
    	setLayout(null);
    	
    	btnAdd.setFont(new Font("Cambria",Font.PLAIN,20));
    	btnAdd1.setFont(new Font("Cambria",Font.PLAIN,20));
    	btnAdd2.setFont(new Font("Cambria",Font.PLAIN,20));
    	btnAdd3.setFont(new Font("Cambria",Font.PLAIN,20));
    	btnAdd4.setFont(new Font("Cambria",Font.PLAIN,20));
    	btnAdd5.setFont(new Font("Cambria",Font.PLAIN,20));
    	btnRemove.setFont(new Font("Cambria",Font.PLAIN,20));
    	
    	btnAdd.setBackground(Color.pink);
    	btnAdd1.setBackground(Color.pink);
    	btnAdd2.setBackground(Color.pink);
    	btnAdd3.setBackground(Color.pink);
    	btnAdd4.setBackground(Color.pink);
    	btnAdd5.setBackground(Color.pink);
    	btnRemove.setBackground(Color.pink);
    	
    	btnAdd.setBorder(border);
    	btnAdd1.setBorder(border);
    	btnAdd2.setBorder(border);
    	btnAdd3.setBorder(border);
    	btnAdd4.setBorder(border);
    	btnAdd5.setBorder(border);
    	btnRemove.setBorder(border);
    	
    	add(btnAdd);
    	add(btnAdd1);
    	add(btnAdd2);
    	add(btnAdd3);
    	add(btnAdd4);
    	add(btnAdd5);
    	
    	add(btnRemove);
    	add(label);
    	add(label1);
    	add(label2);
    	add(label3);
    	add(label4);
    	add(label6);
    	label.setVisible(false);
    	
    }

   public void action()
    {
	  btnAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setIcon(image1);
			label1.setText("Nurul Absar");
			label2.setText("Associate Professor");
			label3.setText("M.Phil (CU), M.S in CSIT (SU)");
			label4.setText("Date of Joining: 1st January 2006");
			label.setVisible(true);
			label1.setVisible(true);
			label2.setVisible(true);
			label3.setVisible(true);
			label4.setVisible(true);
		}
	}); 
	  btnAdd1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(image2);
				label1.setText("Shamsun Nahar Shoma");
				label2.setText("Assistant Professor");
				label3.setText("M.Phil(CU),M.S in Math-CU");
				label4.setText("Date of Joining: 26th January 2010");
				label.setVisible(true);
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
			}
		});
	  btnAdd2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(image3);
				label1.setText("Abhijit Pathak");
				label2.setText("Lecturer");
				label3.setText("M.Sc. (Engg.) in CSE");
				label4.setText("Date of Joining: 2nd February 2010");
				label.setVisible(true);
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
				
			}
		});
	  btnAdd3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(image4);
				label1.setText("Salah Uddin Chowdury");
				label2.setText("Assistant Professor");
				label3.setText("M.Sc(Engg) in CSE-CU.");
				label4.setText("Date of Joining:18th October 2008");
				label.setVisible(true);
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
			}
		});
	  btnAdd4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(image5);
				label1.setText("Mohammad Abir Mahmud");
				label2.setText("Lecturer");
				label3.setText("B.Sc.(Engg.) in CSE");
				label4.setText("Date of Joining: 15th April 2019");
				label.setVisible(true);
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(true);
				label4.setVisible(true);
			}
		});
	  btnAdd5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(image6);
				label1.setText("Monirul Islam");
				label2.setText("Guest Teacher");
				
				label.setVisible(true);
				label1.setVisible(true);
				label2.setVisible(true);
				label3.setVisible(false);
				label4.setVisible(false);
			}
		});
	
       btnRemove.addActionListener(new ActionListener() {
		
 		@Override
 		public void actionPerformed(ActionEvent e) {
 			label.setVisible(false);
 			label1.setVisible(false);
			label2.setVisible(false);
			label3.setVisible(false);
			label4.setVisible(false);
 			
 		}
 	}); 
 	}
   
      public static void main(String[] args) {
		Versity v = new Versity();
	
	}
	
}


