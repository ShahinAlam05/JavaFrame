import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main extends JFrame{

	Main()
	{
		init();
	}
	public void init()
	{
		JLabel label = new JLabel();
		label.setText("Hello BGC");
		
		ImageIcon image = new ImageIcon("image/bgc.png");
		Border border = BorderFactory.createLineBorder(Color.red, 3);
		
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.white);
		label.setFont(new Font("CAMBRIA",Font.PLAIN,20));
		label.setIconTextGap(0);
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		//label.setBounds(100, 100, 150, 120);
		label.setBorder(border);
		
		//label.setHorizontalAlignment(JLabel.CENTER);
		//label.setVerticalAlignment(JLabel.TOP);
		
		//setSize(500,500);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JLabel");
		//setLayout(null);
		
		add(label);
		pack();
		
		
	}
     public static void main(String[] args) {
    	 Main m = new Main();
    	 
     }
     
}


