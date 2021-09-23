import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame{
	
	JButton btnBag = new JButton("Background");
	JButton btnFor = new JButton("Foreground");
	
	JLabel label = new JLabel("This is JLabel...");
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Background&Foreground Change");
		setLayout(null);
		
		btnBag.setBounds(50, 50, 120, 30);
		
		btnFor.setBounds(310, 50, 120, 30);
		
		btnBag.setFocusable(false);
		btnFor.setFocusable(false);
		
		label.setBounds(50, 150, 380, 140);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.setForeground(Color.CYAN);
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		add(btnBag);
		add(btnFor);
		add(label);
	}
	
	public void action()
	{
		btnBag.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent argo) {
				
				JColorChooser chooser = new JColorChooser();
				Color color = JColorChooser.showDialog(null, "Background Color Change", Color.CYAN);
				label.setBackground(color);
				
			}
		});
		
		btnFor.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent argo) {
				
				JColorChooser chooser = new JColorChooser();
				Color color = JColorChooser.showDialog(null, "Background Color Change", Color.CYAN);
				label.setForeground(color);
				
			}
		});
	}

	public static void main(String[] args) {
		
		new Test();
	}

}
