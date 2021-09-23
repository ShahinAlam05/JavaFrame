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


public class Main extends JFrame{

       JButton btnAdd = new JButton("Add");
       JButton btnRemove = new JButton("Remove");
       
	   ImageIcon image = new ImageIcon("images/add.png"); 
	   ImageIcon image1 = new ImageIcon("images/bgc.png");
	   
	   Border border = BorderFactory.createEtchedBorder();
       JLabel label = new JLabel();
       
       
	Main()
	{
		init();
		action();
	}
	
    public void init()
    {
    	btnAdd.setBounds(260,100,80,50);
    	btnRemove.setBounds(350,100,80,50);
    	
    	label.setBounds(100, 160, 450, 300);
    	
    	setSize(700,700);
    	setVisible(true);
    	setLocationRelativeTo(null);
    	setResizable(false);
    	setTitle("JButton");
    	setLayout(null);
    	
    	btnAdd.setFont(new Font("Cambria",Font.PLAIN,20));
    	btnRemove.setFont(new Font("Cambria",Font.PLAIN,20));
    	
    	btnAdd.setBackground(Color.lightGray);
    	btnRemove.setBackground(Color.lightGray);
    	
    	btnAdd.setBorder(border);
    	btnRemove.setBorder(border);
    	
    	label.setIcon(image1);
    	
    	add(btnAdd);
    	add(btnRemove);
    	add(label);
    	
    	label.setVisible(false);
    }

   public void action()
    {
	  btnAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setVisible(true);
			
		}
	}); 
	
       btnRemove.addActionListener(new ActionListener() {
		
 		@Override
 		public void actionPerformed(ActionEvent e) {
 			label.setVisible(false);
 			
 		}
 	}); 
 	}
    
    
	public static void main(String[] args) {
		
     Main m = new Main();
	
	}
	
}


