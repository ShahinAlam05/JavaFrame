import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame{
	
	JLabel label = new JLabel("Mouse Listener");
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Mouse Listener");
		setLayout(null);
		
		label.setBounds(20, 80, 350, 80);
		label.setForeground(Color.GREEN);
		label.setFont(new Font("Arial", Font.BOLD, 40));
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		add(label);
	}
	
	public void action()
	{
		label.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				label.setText("Mouse Clicked.");
			}

			public void mousePressed(MouseEvent e) {

				label.setText("Mouse Pressed.");
			}


			public void mouseReleased(MouseEvent e) {
				
				label.setText("Mouse Released");
			}


			public void mouseEntered(MouseEvent e) {

				label.setText("Mouse Entered");
			}
			

			public void mouseExited(MouseEvent e) {

				label.setText("Mouse Exited");
			}
		});
	}

	public static void main(String[] args) {
		
		new Test();

	}

}
