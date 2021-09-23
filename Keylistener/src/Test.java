import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame{
	
	JLabel label = new JLabel(new ImageIcon("images/rocket.jpg"));

	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setTitle("Key Listener");
		
		label.setBounds(200, 250, 100, 150);
		
		add(label);
	}
	
	public void action()
	{
		addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e ) {
				
				//System.out.println(e.getKeyChar());
			}
			
			public void keyReleased(KeyEvent e) {
			
				//System.out.println(e.getKeyChar());
			}
			
			public void keyPressed(KeyEvent e) {
				
				switch(e.getKeyCode()) {
					case 37:
						label.setLocation(label.getX()-10, label.getY());
						break;
						
					case 39:
						label.setLocation(label.getX()+10, label.getY());
						break;
						
					case 38:
						label.setLocation(label.getX(), label.getY()-10);
						break;
						
					case 40:
						label.setLocation(label.getX(), label.getY()+10);
						break;
				}
				
			}
			
		});
	}
	
	public static void main(String[] args) {
		
		new Test();
	}

}
