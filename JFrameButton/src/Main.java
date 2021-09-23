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

       JButton button = new JButton("Click Me");
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
    	button.setBounds(100,100,150,50);
    	label.setBounds(100, 160, 450, 300);
    	
    	setSize(700,700);
    	setVisible(true);
    	setLocationRelativeTo(null);
    	setResizable(false);
    	setTitle("JButton");
    	setLayout(null);
    	
    	
    	button.setIcon(image);
    	//button.setForeground(Color.white);
    	button.setFont(new Font("Cambria",Font.PLAIN,20));
    	button.setIconTextGap(0);
    	
    	button.setBackground(Color.lightGray);
    	
    	button.setBorder(border);
    	label.setIcon(image1);
    	
    	//button.addActionListener(this);
    	
    	add(button);
    	add(label);
    	
    	label.setVisible(false);
    }

   public void action()
    {
	  button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setVisible(true);
			
		}
	}); 
	}

   /* @Override
	public void actionPerformed(ActionEvent e) {
		
    	if(e.getSource()== button)
    	{
    		System.out.println("Button works");
    	}
			
	}*/
    
    
	public static void main(String[] args) {
		
     Main m = new Main();
	}
	
}
