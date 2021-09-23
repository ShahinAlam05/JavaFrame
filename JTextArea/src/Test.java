import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame{
	
	JLabel label = new JLabel("JText Area:");
	JTextArea txtArea = new JTextArea();
	JScrollPane scroll = new JScrollPane(txtArea);
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		setVisible(true);
		setSize(500, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("JText Area");
		setResizable(false);
		setLayout(null);
		
		label.setBounds(10, 10, 110, 50);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setForeground(Color.CYAN);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		
		scroll.setBounds(125, 10, 320, 250);
		txtArea.setFont(new Font("Arial", Font.BOLD, 25));
		
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		add(label);
		add(scroll);
		
	}
	
	public void action()
	{
		
	}

	public static void main(String[] args) {
		
		new Test();

	}

}
