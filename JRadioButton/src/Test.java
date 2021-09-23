import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Test extends JFrame{
	
	JRadioButton rbMale = new JRadioButton("Male");
	JRadioButton rbFemale = new JRadioButton("Female");
	
	ButtonGroup bg = new ButtonGroup();
	
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		setSize(400, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JRadio Button");
		setLayout(null);
		
		rbMale.setBounds(10, 10, 100, 50);
		rbFemale.setBounds(120, 10, 100, 50);
		
		bg.add(rbMale);
		bg.add(rbFemale);
		
		add(rbMale);
		add(rbFemale);
	}
	
	public void action()
	{
		rbMale.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				//System.out.println("Gender is Male");
				JOptionPane.showMessageDialog(null, "Gender is Male");
			}
		});
		
		rbFemale.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				//System.out.println("Gender is Female");
				JOptionPane.showMessageDialog(null, "Gender is Female");
			}
		});
	}
	
	public static void main(String[] args)
	{
		new Test();
	}

}
